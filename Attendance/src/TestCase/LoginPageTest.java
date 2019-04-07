package TestCase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.TestBase;
import PageFactory.HomePage;
import PageFactory.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginpage; 
	
	public LoginPageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void satrtup() {
		initializeBrowser();
		loginpage = new LoginPage();
	}
	
	@Test
	public void normalize_Attendance() {
		loginpage.user_Login(prop.getProperty("email"));
	}
	
	@AfterMethod
	public void tearDown() {
		closeBrowser();
	}
}
