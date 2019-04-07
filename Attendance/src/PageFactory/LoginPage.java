package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(name="loginfmt") 
	WebElement emailId;
	
	@FindBy(id="idSIButton9")
	WebElement next_button;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public signUpPage user_Login(String email) {
		emailId.sendKeys(email);
		next_button.click();
		return new signUpPage();
	}
}
