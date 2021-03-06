package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import libraries.GenericMethods;

public class SignInPageObject {

	WebDriver driver;
	WebDriverWait wait;
	GenericMethods genericMethods;
	
	public SignInPageObject(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		genericMethods = new GenericMethods(driver, wait);
	}
	
	public String getSignInText() throws Exception {	
		String text = genericMethods.getTextByXpath("//a[@class='login']", "FAIL - Sign In text did not display");
		Reporter.log("Sign In button text is "+text, true);
		return text;
	}
	
	public void clickSignInLink() throws Exception {	
		genericMethods.clickByXpath("//a[@class='login']", "FAIL - Sign In Link did not clicked");
		Reporter.log("Sign In Link is clicked", true);
	}
	
	public void enterEmail(String email) throws Exception {	
		genericMethods.enterByXpath("//input[@id='email']", email, "FAIL - Email did not enter");
		Reporter.log("Email entered successfully", true);
	}

	public void enterPassword(String password) throws Exception {	
		genericMethods.enterById("passwd", password, "FAIL - Password did not enter");
		Reporter.log("Password entered successfully", true);
	}
	
	public void clickSignInButton() throws Exception {	
		genericMethods.clickByXpath("//button[@id='SubmitLogin']", "FAIL - Sign In button did not clicked");
		Reporter.log("Sign In button is clicked", true);
	}
}
