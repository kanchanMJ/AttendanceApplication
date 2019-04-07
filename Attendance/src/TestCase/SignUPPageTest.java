package TestCase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.TestBase;
import PageFactory.LoginPage;
import PageFactory.signUpPage;

public class SignUPPageTest extends TestBase {
	LoginPage loginpage;
	signUpPage signpage;

	public SignUPPageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void satrtup() {
		initializeBrowser();
		loginpage = new LoginPage();
		signpage = loginpage.user_Login(prop.getProperty("email"));
	}
	
	@Test
	public void normalize_Attendance() {
		signpage.EnterPassword(prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		closeBrowser();
	}

}
