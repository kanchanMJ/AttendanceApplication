package TestCase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.TestBase;
import PageFactory.LoginPage;
import PageFactory.signUpPage;
import PageFactory.staySignInPage;

public class staySignInPageTest extends TestBase {
	
	LoginPage loginpage;
	signUpPage signpage;
	staySignInPage staysign; 

	public staySignInPageTest() {
		super();
	}
	
	@BeforeMethod
	public void satrtup() {
		initializeBrowser();
		loginpage = new LoginPage();
		signpage= new signUpPage();
		signpage = loginpage.user_Login(prop.getProperty("email"));
		staysign = signpage.EnterPassword(prop.getProperty("password"));
	}
	
	@Test
	public void clickOnNO() {
		staysign.ClickonNoButton();
	}
	
	@AfterMethod
	public void tearDown() {
		//closeBrowser();
	}


}
