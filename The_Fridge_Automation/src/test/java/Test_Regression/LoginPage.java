package Test_Regression;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class LoginPage extends BaseClass {

	@Test(testName = "Inavlid emailID", priority = 1, enabled = true)
	public void Invalid_email() {
		logger = rep.startTest("Validate inavlid email");
		login.login_details(driver, "admin1@admin.com", "Test@123");
		login.loginClick(driver);
		login.Invalidemail_message(driver);
		logger.log(LogStatus.INFO, "Validate invalid email successfully!");
	}
}
