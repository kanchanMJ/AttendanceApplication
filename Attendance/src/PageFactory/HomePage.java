package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//*[@id='caltogglenextblue']")
	public WebElement normalize; 
	
	@FindBy(xpath="//*[@id='iattendance_tilestartid']/div[3]/div[2]/div/button")
	WebElement normalize_Btton;
	
	public HomePage() {
	PageFactory.initElements(driver, this);
	}
	
	public void normalize_Attendance() {
		normalize.click();
		normalize_Btton.click();
		driver.switchTo().alert();
		System.out.println("Testing pull request");
		
	}
	
	

}
