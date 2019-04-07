 package TestCase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.TestBase;
import PageFactory.HomePage;
import PageFactory.LoginPage;
import PageFactory.signUpPage;
import PageFactory.staySignInPage;
import Utilities.utility;

public class HomePageTest extends TestBase {
	HomePage homepage;
	signUpPage signpage;
	LoginPage loginpage;
	staySignInPage staypage;
	public HomePageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void satrtup() {
		initializeBrowser();
		loginpage = new LoginPage();
		signpage = new signUpPage();
		staypage = new staySignInPage();
		signpage = loginpage.user_Login(prop.getProperty("email"));
		staypage= signpage.EnterPassword(prop.getProperty("password"));
		homepage= staypage.ClickonNoButton();
	}
	
	@Test
	public void normalize_Attendance() {
		utility.explictywait(60, homepage.normalize);
		homepage.normalize_Attendance();
	}
	
	@AfterMethod
	public void tearDown() {
		//closeBrowser();
	}

}
