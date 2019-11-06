import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class gmail 
{
	WebDriver dvr; 
	@Parameters("browsers")
	@Test
	public void one(String browserName) throws InterruptedException
	{
		System.out.println("BrowserName-"+browserName);
		if(browserName.equalsIgnoreCase("firefox")) 
		{
			String driverpath = System.getProperty("user.dir") + 
					"\\src\\Browsers\\geckodriver.exe";	
			System.setProperty("webdriver.gecko.driver", driverpath);   //for firefox
			dvr = new FirefoxDriver(); 
			Thread.sleep(2000);
			dvr.get("https://www.amazon.com/"); 
		}
		else 
		{
			System.out.println("Provide proper input");
	
		}
	}
}