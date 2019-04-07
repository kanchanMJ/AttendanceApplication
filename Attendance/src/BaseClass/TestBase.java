package BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver; 
	public Properties prop; 

	public TestBase() {
		FileInputStream fis;
		try {
			fis = new FileInputStream("C:\\Users\\HP\\git\\AttendanceApplication\\Attendance\\src\\Utilities\\config.properties");
			prop = new Properties();
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void initializeBrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\Software\\Selenium11-BrowserDrivers\\BrowserDrivers\\chromedriver_win32_v2_36\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String appUrl = prop.getProperty("url");
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
	}

	public void closeBrowser() {
		driver.close();
	}

}
