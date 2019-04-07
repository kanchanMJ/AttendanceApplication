package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase;

public class staySignInPage extends TestBase {

	@FindBy(id="idSIButton9")
	WebElement noButton; 

	public staySignInPage() {
		PageFactory.initElements(driver, this);
	}

	public HomePage ClickonNoButton(){
		//Boolean isdisplay = noButton.isDisplayed();
		//Boolean isclick = noButton.isEnabled();
		//System.out.println(isdisplay);
		//System.out.println(isclick);
		noButton.click();
		return new HomePage();
	}
}
