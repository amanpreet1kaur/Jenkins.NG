import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DependsOnMethod {
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
	@Test(dependsOnMethods="test1")
	public void admin1() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	}
}
	
