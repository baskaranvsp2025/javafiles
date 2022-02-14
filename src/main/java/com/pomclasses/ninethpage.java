package com.pomclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class ninethpage {

	public WebDriver driver;
		
	@FindBy(xpath = "//button[@name='processAddress']")
	private WebElement signin;
	
	
	public ninethpage(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
	}
	
	
		public WebElement getSignin() {
		return signin;
	}
	
}
