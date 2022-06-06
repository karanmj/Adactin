package pom.classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mainpom {
	
	//LOGIN PAGE
	@FindBy(xpath = "//input[@type='text']")
	public static WebElement username;
	
	@FindBy(xpath = "//input[@type='password']")
	public static WebElement password;
	
	@FindBy(xpath = "//input[@type='Submit']")
	public static WebElement submit;
	
	//HOME PAGE
	@FindBy(xpath ="//select[@name='location']")
	public static WebElement location;
	
	@FindBy(xpath = "//select[@name='hotels']")
	public static WebElement hotel;
	
	@FindBy(xpath = "//select[@name = 'room_type']")
	public static WebElement Roomtype;
	
	@FindBy(xpath = "//select[@name = 'room_nos']")
	public static WebElement roomnos;
	
	@FindBy(xpath = "//input[@name = 'datepick_in']")
	public static WebElement checkin;
	
	@FindBy(xpath = "//input[@name = 'datepick_out']")
	public static WebElement checkout;
	
	@FindBy(xpath = "//select[@name = 'adult_room']")
	public static WebElement adult;
	
	@FindBy(xpath = "//input[@name = 'Submit']")
	public static WebElement search;
	
	@FindBy(xpath = "//input[@name = 'radiobutton_0']")
	public static WebElement radio;
	
	@FindBy(xpath = "//input[@name = 'continue']")
	public static WebElement conti;
	
	@FindBy(xpath = "//input[@name = 'first_name']")
	public static WebElement fname;
	
	@FindBy(xpath = "//input[@name = 'last_name']")
	public static WebElement lname;
	
	@FindBy(xpath = "//textarea[@name = 'address']")
	public static WebElement address;
	
	@FindBy(xpath = "//input[@name='cc_num']")
	public static WebElement cc;
	
	@FindBy(xpath = "//select[@name='cc_type']")
	public static WebElement cctype;
	
	@FindBy(xpath = "//select[@name='cc_exp_month']")
	public static WebElement month;
	
	@FindBy(xpath = "//select[@name='cc_exp_year']")
	public static WebElement year;
	
	@FindBy(xpath = "//input[@name='cc_cvv']")
	public static WebElement cvv;
	
	@FindBy(xpath = "//input[@name='book_now']")
	public static WebElement Booknow;
	
	@FindBy(xpath = "")
	public static WebElement ;
	
	@FindBy(xpath = "")
	public static WebElement  ;
	
	

}
