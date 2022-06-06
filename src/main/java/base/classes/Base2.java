package base.classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base2 {
	
	public static WebDriver driver;
	
	public static WebDriver bl(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mjkar\\eclipse-workspace\\Cucumber_adactin\\Driver\\chromedriver.exe");
			
		}
		
		else if (type.equals("firefox")) {
			driver = new ChromeDriver();
			System.setProperty("webdriver.gecko.driver", "\\Driver\\firefox.exe");
			driver = new FirefoxDriver();
		}
		return driver;
	
	}
	
	public static void closing() {
		driver.quit();
	}
	
	public static void TS(int value) throws InterruptedException {
		Thread.sleep(value);
	}
	
	public static void ck(WebElement element) {
		element.click();
	}
	
	public static void sk(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public static void getURL(String value) {
		driver.get(value);
	}
	
	public static void max() {
		driver.manage().window().maximize();
	}
	
	public static void impli(int value) {
		driver.manage().timeouts().implicitlyWait(value,TimeUnit.SECONDS);
	}
	
	public static void expli(int value) {
		WebDriverWait wait = new WebDriverWait(driver,2);
	}
}
