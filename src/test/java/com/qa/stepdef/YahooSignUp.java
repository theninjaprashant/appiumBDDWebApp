package com.qa.stepdef;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import com.qa.pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class YahooSignUp extends BasePage {


	//locators

	private By firstname = By.xpath("//input[@id='usernamereg-firstName']");
	private By lastname = By.xpath("//input[@id='usernamereg-lastName']");
	private By emailid = By.xpath("//input[@id='usernamereg-yid']");
	private By password = By.xpath("//input[@id='usernamereg-password']");
	private By phone = By.xpath("//input[@id='usernamereg-phone']");

	private By month = By.xpath("//select[@id='usernamereg-month']");
	private By day = By.xpath("//input[@id='usernamereg-day']");
	private By year = By.xpath("//input[@id='usernamereg-year']");
	private By gender = By.xpath("//input[@id='usernamereg-freeformGender']");
	private By march = By.xpath("//option[@value='3']");

	private By emailerror = By.xpath("//div[@id='reg-error-yid']");
	private By passworderror = By.xpath("//div[@id='reg-error-password']");
	private By phoneerror = By.xpath("//div[@id='reg-error-phone']");
	private By continuebutton = By.xpath("//button[@id='reg-submit-button']");
	



	//Actions


	@And("user enter firstname and lastname")
	public void user_enter_firstname_and_lastname() {
		sync(3000l);			//I have added this static wait just to show actions slowly
		sendkeys(driver, firstname, 10, "Prashant");
		sendkeys(driver, lastname, 10, "ShaniDev");
	}

	@Then("user enter emailid and password")
	public void user_enter_emailid_and_password() {
		sendkeys(driver, emailid, 10, "prashanttest12");
		sendkeys(driver, password, 10, "12345test");
	}

	@Then("user enter phone number")
	public void user_enter_phone_number() {
		sendkeys(driver, phone, 10, "8178787168");
		sync(4000l);
	}


	@Then("user select month of birth and enter day and year")
	public void user_select_month_of_birth_and_enter_day_and_year() {
		click(month, null);
		sync(2000l);
		click(march, null);
		sync(2000l);
		sendkeys(driver, day, 10, "10");
		sendkeys(driver, year, 10, "1997");
	}

	@And("user enter gender")
	public void user_enter_gender() {
		sendkeys(driver, gender, 10, "Male");
		sync(10000l);
	}


	@When("user enter emailid that is already created")
	public void user_enter_emailid_that_is_already_created() {
		sendkeys(driver, emailid, 10, "test");
	}

	@When("user enter weak password")
	public void user_enter_weak_password() {
		sendkeys(driver, password, 10, "12345");
	}

	@When("user enter alphabets in phone number field")
	public void user_enter_alphabets_in_phone_number_field() {
		sendkeys(driver, phone, 10, "abcdefgh");
		click(gender, null);
		sync(7000l);
	}

	@Then("validate all the error messages")
	public void validate_all_the_error_messages() {
		SoftAssert softasert = new SoftAssert();
		String emailErrorMessage = driver.findElement(emailerror).getText();
		String passErrMsg = driver.findElement(passworderror).getText();
		String phoneErrMsg = driver.findElement(phoneerror).getText();
		softasert.assertEquals(emailErrorMessage,"This email address is not available for sign up, try something else", "Email Erro msg do not match");
		softasert.assertEquals(passErrMsg, "Your password isn’t strong enough, try making it longer.", "Password Erro msg do not match");
		softasert.assertEquals(phoneErrMsg, "That doesn’t look right, please re-enter your phone number.", "Phone error msg do not match");
		softasert.assertAll();
	}

}
