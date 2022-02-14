package com.pomclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class seventhpage {

	public WebDriver driver;
		
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement signin;
	
	
	public seventhpage(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
	}
	
	
		public WebElement getSignin() {
		return signin;
	}
	
}
