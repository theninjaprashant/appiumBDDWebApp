package com.qa.stepdef;

import org.openqa.selenium.WebElement;

import com.qa.pages.BasePage;
import com.qa.pages.CalculatorPage;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CalculatorStepdef extends BasePage {
	
	CalculatorPage calcPage = new CalculatorPage();
	
	
	@Given("user press number seven")
	public void user_press_number_seven() throws InterruptedException {
	calcPage.enterseven();
	}

	@Then("user press add button")
	public void user_press_add_button() throws InterruptedException {
		calcPage.pressaddbutton();
	    
		
	}

	@Then("user press number four")
	public void user_press_number_six() {
		calcPage.enterfour();
	}

	@Then("user press equal button")
	public void user_press_equal_button() {
		calcPage.pressedequal();
	
	}

	
	

}
