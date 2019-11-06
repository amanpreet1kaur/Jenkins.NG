import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parallel_fb {

	
		WebDriver driver; 
		@Parameters("browsers")
		@Test
		public void fbopen(String browserName)
		{
			System.out.println("BrowserName-"+browserName);
			if(browserName.equalsIgnoreCase("chrome")) {
			String driverpath = System.getProperty("user.dir") + "\\src\\Browsers\\chromedriver.exe";	
			System.setProperty("webdriver.chrome.driver", driverpath);   //for chrome
			driver = new ChromeDriver(); 
			driver.get("https://www.facebook.com/"); 
			}
			else if (browserName.equalsIgnoreCase("firefox")) {
				System.out.println("firefox is need to open");
			
				
			String driverpath = System.getProperty("user.dir") + "\\src\\Browsers\\geckodriver.exe";	
			System.setProperty("webdriver.geckodriver.driver", driverpath);   //for firefox
			driver = new FirefoxDriver (); 
			
			driver.get("https://www.facebook.com/"); 
				}
				
			}
		}

	


