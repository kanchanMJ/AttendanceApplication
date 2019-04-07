package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase;

public class signUpPage extends TestBase {
	
	@FindBy(name="Password")
	WebElement password;
	
	@FindBy(id="submitButton")
	WebElement signin_button; 
	
	public signUpPage() {
		PageFactory.initElements(driver, this);
	}
	
	public staySignInPage EnterPassword(String pass) {
		password.sendKeys(pass);
		signin_button.click();
		return new staySignInPage();
	}

}
