package com.pomclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class twelthpage {

	public WebDriver driver;
		
	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement signin;
	
	
	public twelthpage(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
	}
	
	
		public WebElement getSignin() {
		return signin;
	}
	
}
