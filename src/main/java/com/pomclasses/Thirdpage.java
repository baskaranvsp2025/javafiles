package com.pomclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Thirdpage {

	public WebDriver driver;
		
	@FindBy(xpath = "//img[@src='http://automationpractice.com/img/p/1/0/10-home_default.jpg']")
	private WebElement signin;
	
	
	public Thirdpage(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
	}
	
		public WebElement getSignin() {
		return signin;
	}
	
}
