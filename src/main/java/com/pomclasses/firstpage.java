package com.pomclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class firstpage {

	public WebDriver driver;
	
	@FindBy(xpath = "(//input[@name='email'])[1]")
	private WebElement email;
	
	@FindBy(xpath = "(//input[@name='passwd'])[1]")
	private WebElement password;
	
	@FindBy(xpath = "//button[@name='SubmitLogin']")
	private WebElement signin;
	
	
	public firstpage(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
	}
	
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSignin() {
		return signin;
	}
	
	
}
