package Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.TestBase;

public class utility extends TestBase {
	
	static WebDriverWait wait; 
	
	public static void explictywait(int second, WebElement element) {
		wait = new WebDriverWait(driver, second);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
