import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class facebook 
{
	WebDriver driver; 
	@Parameters("browsers")
	@Test
	public void two(String browserName) throws InterruptedException
	{
		System.out.println("BrowserName-"+browserName);
		if(browserName.equalsIgnoreCase("firefox")) 
		{
			String driverpath = System.getProperty("user.dir") + 
					"\\src\\Browsers\\geckodriver.exe";	
			System.setProperty("webdriver.gecko.driver", driverpath);   //for firefox
			driver = new FirefoxDriver(); 
			Thread.sleep(2000);
			driver.get("https://www.facebook.com/"); 
		}
		else 
		{
			System.out.println("-----------");
	
		}
	}
}
