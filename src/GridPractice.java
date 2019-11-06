import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridPractice {
			
	@Test
	public void launch() throws MalformedURLException {
	 DesiredCapabilities cap = DesiredCapabilities.chrome();
	 cap.setBrowserName("chrome");
		cap.setPlatform(Platform.ANY);
		System.out.println("abc");
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
		driver.get("http://the-internet.herokuapp.com/key_presses");
		//driver.get("https://www.facebook.com/");
}
}