package stepDefinition;

import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.classes.BaseClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import pom.classes.Mainpom;

public class stepDefinition extends BaseClass {
	 
	 FileInputStream f = new FileInputStream("PropertyFile");

	@Given("^User launches adactin application$")
	public void user_launches_adactin_application() throws Throwable {
		PageFactory.initElements(driver, Mainpom.class);
	}

	@When("^User enter valid username and password$")
	public void user_enter_valid_username_and_password() throws Throwable {
		
		Mainpom.username.sendKeys(p.);
		Mainpom.password.sendKeys(p.);
	}

	@Then("^User clicks login button$")
	public void user_clicks_login_button() throws Throwable {
		Mainpom.submit.click();
	}

	@Then("^User navigates to the home page$")
	public void user_navigates_to_the_home_page() throws Throwable {
		
	}
	
	@Given("^Select location of hotel from dropdown$")
	public void select_location_of_hotel_from_dropdown() throws Throwable {
	    Select location = new Select(Mainpom.location);
	    location.selectByVisibleText("Melbourne");
	}

	@When("^Select your favorite hotel$")
	public void select_your_favorite_hotel() throws Throwable {
	   Select hotels = new Select(Mainpom.hotel);
	   hotels.selectByVisibleText("Hotel Sunshine");
	}

	@When("^Select your room type which is suitable for you$")
	public void select_your_room_type_which_is_suitable_for_you() throws Throwable {
	  Select Rt = new Select(Mainpom.Roomtype);
	  Rt.selectByVisibleText("Double");
	}

	@When("^Select number of room for you from dropdown$")
	public void select_number_of_room_for_you_from_dropdown() throws Throwable {
		Select rm = new Select(Mainpom.roomnos);
		rm.selectByValue("1");
	}

	@When("^enter checkin date with valid format$")
	public void enter_checkin_date_with_valid_format() throws Throwable {
	    Mainpom.checkin.clear();
	    Mainpom.checkin.sendKeys("10/06/2022");
	}

	@When("^enter valid checkout date which should be in future date$")
	public void enter_valid_checkout_date_which_should_be_in_future_date() throws Throwable {
	   Mainpom.checkout.clear();
	   Mainpom.checkout.sendKeys("30/06/2022");
	}

	@When("^select number of adults per room$")
	public void select_number_of_adults_per_room() throws Throwable {
	    Select adult = new Select(Mainpom.adult);
	    adult.selectByValue("1");
	}

	@When("^select number of childrens per room which is not mandatory$")
	public void select_number_of_childrens_per_room_which_is_not_mandatory() throws Throwable {
	    
	}

	@Then("^click on the search button$")
	public void click_on_the_search_button() throws Throwable {
	   Mainpom.search.click();
	}
	
	@Given("^check hotel details$")
	public void check_hotel_details() throws Throwable {
	   
	}
	
	@When("^click the select hotel radio button$")
	public void click_the_select_hotel_radio_button() throws Throwable {
		 Mainpom.radio.click();
	}



	@When("^click on the continue button$")
	public void click_on_the_continue_button() throws Throwable {
	    Mainpom.conti.click();
	}

	@Then("^user navigates to the payment option$")
	public void user_navigates_to_the_payment_option() throws Throwable {
	   
	}
	
	@Given("^enter name in the first name field$")
	public void enter_name_in_the_first_name_field() throws Throwable {
	    Mainpom.fname.sendKeys("Universe");
	}

	@When("^enter the last name in the field$")
	public void enter_the_last_name_in_the_field() throws Throwable {
	   Mainpom.lname.sendKeys("Boss");
	}

	@When("^enter billing address of the user$")
	public void enter_billing_address_of_the_user() throws Throwable {
	   Mainpom.address.sendKeys("49, Gandhi street Kalaivanar colony Anna nagar west extension chennai-600101");
	}

	@When("^enter valid credit card number$")
	public void enter_valid_credit_card_number() throws Throwable {
	   Mainpom.cc.sendKeys(p.getprop(""));
	}

	@When("^select the card type$")
	public void select_the_card_type() throws Throwable {
	    Select ct = new Select(Mainpom.cctype);
	    ct.selectByIndex(2);
	}

	@When("^select valid expiry month of the card$")
	public void select_valid_expiry_month_of_the_card() throws Throwable {
	    Select month = new Select(Mainpom.month);
	    month.selectByIndex(3);
	}

	@When("^select expiry year$")
	public void select_expiry_year() throws Throwable {
	   Select yr = new Select(Mainpom.year);
	   yr.selectByIndex(8);
	}

	@When("^enter correct ccv number$")
	public void enter_correct_ccv_number() throws Throwable {
	   Mainpom.cvv.sendKeys(p.getprop(""));
	}

	@Then("^click on the book now button$")
	public void click_on_the_book_now_button() throws Throwable {
	   Mainpom.Booknow.click();
	   TS(5000);
	}
	
	@Given("^navigate to booking history page$")
	public void navigate_to_booking_history_page() throws Throwable {
	    WebDriverWait wait = new WebDriverWait(driver,3000);
	    wait.until(ExpectedCondition.elementToBeClickable())
	}

	@When("^take screenshot of the order number$")
	public void take_screenshot_of_the_order_number() throws Throwable {
	   
	}

	@Then("^click on the logout button$")
	public void click_on_the_logout_button() throws Throwable {
	    
	}








}
