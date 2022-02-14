package com.Maven_Project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Runnerclass extends Baseclass {
	
	
	public static void main(String[] args) throws InterruptedException {
		
			
		browserlaunch("chrome");
		launchurl("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		

		WebElement email = driver.findElement(By.xpath("(//input[@name='email'])[1]"));

		sendkey(email, "baskaranvsp@gmail.com");

		WebElement password = driver.findElement(By.xpath("(//input[@name='passwd'])[1]"));
		sendkey(password, "Baskar@#12345");
				
		
		
		//screenshot(C:\Users\BASKAR\eclipse-workspace\Baskar\Maven_Project\Mavenscreenshot\1.png);
		
		WebElement signin = driver.findElement(By.xpath("//button[@name='SubmitLogin']"));
		click(signin);
		
		
		implicitwait(20);
		WebElement dresses = driver.findElement(By.xpath("(//a[text()= 'Dresses'])[2]"));
		click(dresses);
		
		
		implicitwait(20);
		WebElement printeddress = driver.findElement(By.xpath("//img[@src='http://automationpractice.com/img/p/1/0/10-home_default.jpg']"));
		click(printeddress);

		implicitwait(40);
		driver.switchTo().frame(0);
		WebElement quantityincrease = driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
		click(quantityincrease);
		click(quantityincrease);
		click(quantityincrease);
		click(quantityincrease);
		
		
		implicitwait(30);
		WebElement size = driver.findElement(By.name("group_1"));
		//Select s1 = new Select(size);
		//s1.selectByIndex(1);
		selecttoindex(1);
		
		
		
		implicitwait(20);
		WebElement addtocart = driver.findElement(By.name("Submit"));
		click(addtocart);
		
		
		implicitwait(20);
		driver.switchTo().defaultContent();
		WebElement proceed1 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		click(proceed1);
		
		
		implicitwait(20);
		WebElement checkout1 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		click(checkout1);
		
		implicitwait(20);
		WebElement checkout2 = driver.findElement(By.xpath("//button[@name='processAddress']"));
		click(checkout2);
		
		implicitwait(20);
		WebElement checkbox = driver.findElement(By.id("cgv"));
		click(checkbox);
		
		implicitwait(20);
		WebElement proceedtocheckout =driver.findElement(By.name("processCarrier"));
		click(proceedtocheckout);
		
		implicitwait(20);
		WebElement payment =driver.findElement(By.xpath("//a[@class='bankwire']"));
		click(payment);
		
		implicitwait(20);
		WebElement confirmorder =driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		click(confirmorder);
		
		
	}
	
}