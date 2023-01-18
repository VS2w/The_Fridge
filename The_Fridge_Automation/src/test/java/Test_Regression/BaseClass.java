package Test_Regression;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import PageObjects.LoginObject;
import Utility.BrowserFactory;
import Utility.CommonFunctions;
import Utility.ExtentManager;

public class BaseClass {

	public static WebDriver driver;

	public static BrowserFactory browser = new BrowserFactory();
	public static CommonFunctions comm = new CommonFunctions();
	public ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest logger;
	public static LoginObject login = new LoginObject();

	@BeforeSuite(description = "initializing Driver", alwaysRun = true)
	@Parameters({"enviroment"})
	public void initializeDriver(String enviroment) throws InterruptedException {
		driver = browser.openbrowser();
		driver.manage().window().maximize();
		driver.get("https://thefridgestage.iworklab.com");

	}
}
