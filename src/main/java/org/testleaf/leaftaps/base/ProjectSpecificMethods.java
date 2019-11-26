package org.testleaf.leaftaps.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.LogStatus;

import week5.day2.Extend;

public class ProjectSpecificMethods extends Extend {

	public ChromeDriver driver;
	@Parameters({"url","username","password"})
 @BeforeMethod
	public void login(String url, String username, String password) {
		System.setProperty("webdriver.chrome.driver", "C://TestLeaf//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		// Enter UserName
		driver.findElementById("username").sendKeys(username);
		// Enter Password
		driver.findElementById("password").sendKeys(password);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	    test.log(LogStatus.PASS, "Test1");
	}
@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
