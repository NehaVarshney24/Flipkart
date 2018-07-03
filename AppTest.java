package selenium.four.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class AppTest {
		
	WebDriver driver;
	
	@BeforeClass
	   public void launchBrowser(){
		    
		    System.setProperty("webdriver.chrome.driver","D:\\Neha Workspace\\chromedriver_win32\\chromedriver.exe");
		   	driver = new ChromeDriver();
		   	driver.get("https://www.flipkart.com");
		   	
	   }
	
	@Test
	public void loginCredentials()
	{
		driver.findElement(By.className("_2zrpKA")).sendKeys("7838324056");
		driver.findElement(By.cssSelector("body > div.mCRfo9 > div > div > div > div > div.Km0IJL.col.col-3-5 > div > form > div:nth-child(2) > input")).sendKeys("7838324056");
		
		driver.findElement(By.className("_1VgS7d")).submit();
		
		String text=driver.findElement(By.xpath("//div[@class='_1Wr4v5']/div/div/div/div/span/div")).getText();
		System.out.print("hello");
		Assert.assertTrue(text.contains("Neha"));
	}
	
	
	@Test
	public void selectFromDropDownList() {
		
		driver.findElement(By.xpath("//div[@class='zi6sUf']/div/ul/li/a/span")).click();
		driver.findElement(By.xpath("//li[@class='_1KCOnI']/a")).click();
		
	}
		
	@AfterClass
		public void closeBrowser() {
		
		driver.quit();
	}
}