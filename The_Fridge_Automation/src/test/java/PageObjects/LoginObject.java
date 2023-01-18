package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Test_Regression.BaseClass;

public class LoginObject extends BaseClass {

	// Xpath for login page
	By email_login = By.xpath("//input[@type='email']");
	By Password_login = By.xpath("//input[@type='password']");
	By login_button = By.xpath("//button[text()='LOG IN']");
	By email_error = By.xpath("//div[contains(text(),'Please enter your email address in a valid format.')]");

	public void login_details(WebDriver driver, String email, String password) {
		comm.sendKeys(driver, email_login, email);
		comm.sendKeys(driver, Password_login, password);

	}
	
	public void loginClick(WebDriver driver) {
		comm.Explicitywait(driver, login_button);
		comm.Click(driver, login_button);
	}

	public void Invalidemail_message(WebDriver driver) {
		comm.Explicitywait(driver, email_error);
		if(driver.findElements(By.xpath("//div[contains(text(),'Please enter your email address in a valid format.')]")).size()!=0) {
			System.out.println("Email validation error displayed!");
		}
		else{
			System.err.println("Email validation error is not displayed!");
		}
	}
}
