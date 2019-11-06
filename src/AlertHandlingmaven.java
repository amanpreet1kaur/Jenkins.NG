


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandlingmaven {

	public static WebDriver driver;
	
	@Test
	public void launch() throws Exception{
		
		String driverpath = System.getProperty("user.dir") + "\\src\\Browsers\\chromedriver.exe";	
		System.setProperty("webdriver.chrome.driver", driverpath);   //for chrome
		driver = new ChromeDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com/"); 
		
	 
	//driver.get("file:///C:/Users/install/Downloads/template_7/index.html");
	//driver.findElement(By.xpath("//input[@value='AlertBox']")).click();
	driver.get("https://www.facebook.com/"); 
//	Alert alt=driver.switchTo().alert();
//	alt.accept();
	 

	}

}
