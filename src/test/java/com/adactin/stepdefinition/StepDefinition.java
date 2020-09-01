package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SignInPage;
import com.adactin.runner.TestRunner;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {

	public static WebDriver driver = TestRunner.driver;
	PageObjectManager pom=new PageObjectManager(driver);
	
	@Given("^User launch the Adactin application$")
	public void user_launch_the_Adactin_application() throws Throwable {
	       System.out.println("Adactin application is launched");
	}

	@When("^User log into the application$")
	public void user_log_into_the_application() throws Throwable {
		 System.out.println("User logs into the application");
	}
	@Given("^User launches the application$")
	public void user_launches_the_application() throws Throwable {
		 //driver = getBrowser("chrome");
		//getUrl("http://adactinhotelapp.com/");
		String url = FileReaderManager.getInstance().getCrInstance().getUrl();
		getUrl(url);
	}

	/*@When("^User enters the valid username in Username field$")
	public void user_enters_the_valid_username_in_Username_field() throws Throwable {
		//SignInPage sp= new SignInPage(driver);
		inputValuestoElement(pom.getSp().getUserName(),"sujithaanand");
				}

	@When("^User enters the valid password in password field$")
	public void user_enters_the_valid_password_in_password_field() throws Throwable {
		//SignInPage sp= new SignInPage(driver);
		inputValuestoElement(pom.getSp().getPassword(),"suji@29");
	}*/
	
	@When("^User enters the valid \"([^\"]*)\" in Username field$")
	public void user_enters_the_valid_in_Username_field(String username) throws Throwable {
		inputValuestoElement(pom.getSp().getUserName(),username);
	}

	@When("^User enters the valid \"([^\"]*)\" in password field$")
	public void user_enters_the_valid_in_password_field(String password) throws Throwable {
		inputValuestoElement(pom.getSp().getPassword(),password);
	}

	@When("^User clicks the Login Button$")
	public void user_clicks_the_Login_Button() throws Throwable {
		//SignInPage sp= new SignInPage(driver);
		clickOnElement(pom.getSp().getLoginBtn());
	}

	@Then("^User verify the SignInPage navigates to the Search Hotel page$")
	public void user_verify_the_SignInPage_navigates_to_the_Search_Hotel_page() throws Throwable {
		System.out.println("search hotel");
	}

	/*@When("^User selects the location in the Select Location field$")
	public void user_selects_the_location_in_the_Select_Location_field() throws Throwable {
		//SearchHotel sh=new SearchHotel(driver);
		selectDropDown(pom.getSh().getLocation(),"Melbourne","Value");
	}

	@When("^User selects the Hotel in the Select Hotel field$")
	public void user_selects_the_Hotel_in_the_Select_Hotel_field() throws Throwable {
		//SearchHotel sh=new SearchHotel(driver);
		selectDropDown(pom.getSh().getHotel(),"Hotel Creek","value");
	}*/
	
	@When("^User selects the \"([^\"]*)\" as \"([^\"]*)\" in the Select Location field$")
	public void user_selects_the_as_in_the_Select_Location_field(String location, String option) throws Throwable {
		selectDropDown(pom.getSh().getLocation(),location,option);
	}

	@When("^User selects the \"([^\"]*)\" as \"([^\"]*)\" in the Select Hotel field$")
	public void user_selects_the_as_in_the_Select_Hotel_field(String hotel, String option) throws Throwable {
		selectDropDown(pom.getSh().getHotel(),hotel,option);
	}



	@When("^User selects the room type in the Select Room Type field$")
	public void user_selects_the_room_type_in_the_Select_Room_Type_field() throws Throwable {
		selectDropDown(pom.getSh().getRoom(), "Double", "value");
	}

	@When("^User selects the number of rooms$")
	public void user_selects_the_number_of_rooms() throws Throwable {
		selectDropDown(pom.getSh().getNumbrooms(),"2","value");
	}

	@When("^User selects the check in date$")
	public void user_selects_the_check_in_date() throws Throwable {
		inputValuestoElement(pom.getSh().getIn(),"23/08/2020");
	}

	@When("^User selects the check out date$")
	public void user_selects_the_check_out_date() throws Throwable {
		inputValuestoElement(pom.getSh().getOut(),"24/08/2020");
	}

	@When("^User enter the adults per Room$")
	public void user_enter_the_adults_per_Room() throws Throwable {
		selectDropDown(pom.getSh().getAdult(),"2","value");
	}

	@When("^User enter the children per Room$")
	public void user_enter_the_children_per_Room() throws Throwable {
		selectDropDown(pom.getSh().getChild(),"2","value");
	}

	@When("^User clicks on Search button to search for the details$")
	public void user_clicks_on_Search_button_to_search_for_the_details() throws Throwable {
		//SearchHotel sh=new SearchHotel(driver);
		//clickOnElement(sh.getSearchBtn());
		clickOnElement(pom.getSh().getSearchBtn());
	}

	@Then("^User verify the Search Hotel page navigates to Select Hotel page$")
	public void user_verify_the_Search_Hotel_page_navigates_to_Select_Hotel_page() throws Throwable {

	}

	@When("^User clicks on the selected radio button$")
	public void user_clicks_on_the_selected_radio_button() throws Throwable {
		clickOnElement(pom.getS1().getRadio());
	}

	@When("^User clicks on continue button$")
	public void user_clicks_on_continue_button() throws Throwable {
		clickOnElement(pom.getS1().getContinue());
	}

	@Then("^User Verify the Select Hotel page navigates to  Hotel Confirmation page$")
	public void user_Verify_the_Select_Hotel_page_navigates_to_Hotel_Confirmation_page() throws Throwable {

	}

	@When("^User enters the Firstname$")
	public void user_enters_the_Firstname() throws Throwable {
		inputValuestoElement(pom.getHc().getFirstname(),"Sujitha");
	}

	@When("^User enters the Lastname$")
	public void user_enters_the_Lastname() throws Throwable {
		inputValuestoElement(pom.getHc().getLastname(),"Anand");
	}

	@When("^User enters the Address$")
	public void user_enters_the_Address() throws Throwable {
		inputValuestoElement(pom.getHc().getAddress(), "Sydney Cross");

	}

	@When("^User enters the Cardno$")
	public void user_enters_the_Cardno() throws Throwable {
		inputValuestoElement(pom.getHc().getCardno(), "1234567856789876");
	}

	@When("^User enters the Cardtype$")
	public void user_enters_the_Cardtype() throws Throwable {
		selectDropDown(pom.getHc().getCardtype(),"VISA","value");
	}

	@When("^User enters the Expirymonth$")
	public void user_enters_the_Expirymonth() throws Throwable {
		selectDropDown(pom.getHc().getExpirymonth(),"7","value");
	}

	@When("^User enters the Expiryyear$")
	public void user_enters_the_Expiryyear() throws Throwable {
		selectDropDown(pom.getHc().getExpiryyear(),"2021","value");
	}

	@When("^User enters the Cvvnumber$")
	public void user_enters_the_Cvvnumber() throws Throwable {
		inputValuestoElement(pom.getHc().getCvvnumber(), "134");
	}

	@When("^User enters the Booknow$")
	public void user_enters_the_Booknow() throws Throwable {
		clickOnElement(pom.getHc().getBooknow());
	}

	@Then("^User checks the booking confirmation in the Booking Confirmation page$")
	public void user_checks_the_booking_confirmation_in_the_Booking_Confirmation_page() throws Throwable {

	}

	@Then("^User clicks the logout button$")
	public void user_clicks_the_logout_button() throws Throwable {
		clickOnElement(pom.getHc().getLogout());
	}

}
