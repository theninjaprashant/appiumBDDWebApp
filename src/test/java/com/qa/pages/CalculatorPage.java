package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.utils.TestUtils;

public class CalculatorPage extends BasePage {
	TestUtils utils = new TestUtils();

	
	private By seven = By.id("com.android.calculator2:id/digit_7");
	private By four = By.id("com.android.calculator2:id/digit_4");
	private By addbutton = By.id("com.android.calculator2:id/op_add");
	private By equalbutton = By.id("com.android.calculator2:id/eq");
	

	//Actions
	public void enterseven() throws InterruptedException {
		Thread.sleep(3000);
		click(seven, "pressed seven digit");	
		
	}
	
	public void enterfour() {
		sync(3000l);
		click(four, "pressed four digit");	
		
	}
	
	public void pressaddbutton() throws InterruptedException {
		Thread.sleep(3000);
		click(addbutton, "pressed add button");	
		
	}
	
	public void pressedequal() {
		sync(3000l);
		click(equalbutton, "pressed equalbutton");	
		
	}
	
	
	
	
	
}
