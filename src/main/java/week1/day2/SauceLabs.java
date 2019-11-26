package week1.day2;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class SauceLabs {
	
	
	public static void main(String[] args) {
	 final String USERNAME = "kalai_arasu123";
	 final String ACCESS_KEY = "17d7ca8c-367d-4a66-8a62-5169a6b95251";
	 final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub"; 	
	 DesiredCapabilities caps = DesiredCapabilities.chrome();
	 caps.setCapability("platform", "Windows 7");
	 caps.setCapability("browserName", "Chrome");
	 caps.setCapability("version", "latest-12");
	 caps.setCapability("name", "Sauce Lab Testing");
	 caps.setCapability("screenResolution", "1680x1050"); 
	 try {
	 RemoteWebDriver driver = new RemoteWebDriver(new URL(URL),caps);
	 driver.get("https://www.google.com");
	 Thread.sleep(5000);
	 System.out.println("title of page is: " + driver.getTitle());
	 driver.findElement(By.name("q")).sendKeys("Sauce Labs Integration");
	 Thread.sleep(3000);
	 Actions a = new Actions(driver);
	 a.sendKeys(Keys.ENTER).build().perform();
	 Thread.sleep(3000);
	 driver.close(); 
	 }
	 catch(Exception e) {
	 System.out.println(e);
	 }
	}
}
