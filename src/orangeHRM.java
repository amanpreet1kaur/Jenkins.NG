import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class orangeHRM 
{
	WebDriver driver; 
	@BeforeTest
	public void befretest()
	{
		String driverpath = System.getProperty("user.dir") + "\\src\\Browsers\\chromedriver.exe";	
		System.setProperty("webdriver.chrome.driver", driverpath);   //for chrome
		driver = new ChromeDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com/"); 		
	}
	
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//input[contains(@id,'txtUsername')]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[contains(@id,'txtPassword')]")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();  
	}
		@Test
	public void test2() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.id("welcome")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		}
	//@AfterMethod
//	public void aftermthod()
//	{
//		driver.close();
//	}
}
