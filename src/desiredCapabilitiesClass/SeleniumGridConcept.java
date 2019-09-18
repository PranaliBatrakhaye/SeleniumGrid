package desiredCapabilitiesClass;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumGridConcept 
{
	//verify on http://localhost:1992/grid/console
	public WebDriver driver;
	
	@Parameters ({"browser"})
	@BeforeTest
	public void openBrowser(String browsernm) throws MalformedURLException
	{
		if (browsernm.equalsIgnoreCase("chrome"))
		{
			System.out.println("In Chrome browser");
			DesiredCapabilities cap =new DesiredCapabilities();
			cap.setBrowserName("chrome");
			System.out.println(2);
			cap.setPlatform(Platform.WINDOWS);
			System.setProperty("webdriver.chrome.driver", "E:\\Selenum\\29062019\\chromedriver.exe");
			//String node="http://localhost:4444/wd/hub";
			String node="http://localhost:1995/wd/hub";
			System.out.println(3);
			driver = new RemoteWebDriver(new URL(node),cap);
			System.out.println("Chrome browser is opened successfully");			
		 }
	}
	
	@Test
	public void enterUrl()
	{
		System.out.println(1);
		driver.get("https://www.google.com");
	}
}
//first open hub
//then open node
