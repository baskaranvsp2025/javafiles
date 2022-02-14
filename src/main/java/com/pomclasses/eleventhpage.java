package com.pomclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class eleventhpage {

	public WebDriver driver;
		
	@FindBy(name = "processCarrier")
	private WebElement signin;
	
	
	public eleventhpage(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
	}
	
	
		public WebElement getSignin() {
		return signin;
	}
	
}
