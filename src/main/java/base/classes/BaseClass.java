package base.classes;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pom.classes.Mainpom;

public class BaseClass extends Base2{
	
    public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		
	    bl("chrome");
	    driver = new ChromeDriver();
	    getURL("http://adactinhotelapp.com/index.php");
	    max();
	    impli(5000);
		// From property file
		FileInputStream f = new FileInputStream("PropertyFile");
		Properties p = new Properties();
		p.load(f);
		
		
		String us = p.getProperty("Username");
		String pass = p.getProperty("Password");
		
		// From pom
	//	PageFactory.initElements(driver, Mainpom.class);	
		sk(Mainpom.username,us);
		Mainpom.username.sendKeys(us);
		Mainpom.password.sendKeys(pass);
		Mainpom.submit.click();
		Mainpom.location.click();
				
		
	}

	
	
}
