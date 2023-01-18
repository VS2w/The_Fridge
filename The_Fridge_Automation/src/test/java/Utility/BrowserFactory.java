package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	 WebDriver driver;
	
	public WebDriver openbrowser() {
		// Run automation in Incognito
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--incognito");
				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability(ChromeOptions.CAPABILITY, options);
				options.merge(capabilities);
				// String projectPath = System.getProperty("user.dir");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(options);
				return driver;
	}

}
