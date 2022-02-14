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

import com.pomclasses.Thirdpage;
import com.pomclasses.eightpage;
import com.pomclasses.eleventhpage;
import com.pomclasses.fifthpage;
import com.pomclasses.firstpage;
import com.pomclasses.fourthpage;
import com.pomclasses.ninethpage;
import com.pomclasses.secondpage;
import com.pomclasses.seventhpage;
import com.pomclasses.sixthpage;
import com.pomclasses.tenthpage;
import com.pomclasses.thirteenpage;
import com.pomclasses.twelthpage;

public class Runnerclass3 extends Baseclass {
	
	
	public static void main(String[] args) {
		
			
		browserlaunch("chrome");
		launchurl("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		
		firstpage fp1 = new firstpage(driver);
		//WebElement email = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
		inputvalues(fp1.getEmail(), "baskaranvsp@gmail.com");
		

		//WebElement password = driver.findElement(By.xpath("(//input[@name='passwd'])[1]"));
		inputvalues(fp1.getPassword(), "Baskar@#12345");
				
					
		//WebElement signin = driver.findElement(By.xpath("//button[@name='SubmitLogin']"));
		inputvalues(fp1.getSignin());
		
		
		
		implicitwait(20);
		//WebElement dresses = driver.findElement(By.xpath("(//a[text()= 'Dresses'])[2]"));
		//click(dresses);
		secondpage sp1 = new secondpage(driver);
		inputvalues(sp1.getSignin());
		
		
		Thirdpage tp1 = new Thirdpage(driver);
		inputvalues(tp1.getSignin());
		
		
		fourthpage fp2 = new fourthpage(driver);
		inputvalues(fp2.getSignin());
		
		
		fifthpage fp3 = new fifthpage(driver);
		inputvalues(fp3.getSignin());
		
		sixthpage sp2 = new sixthpage(driver);
		inputvalues(sp2.getSignin());
		
		
		seventhpage sp3 = new seventhpage(driver);
		inputvalues(sp3.getSignin());
		
		eightpage ep1 = new eightpage(driver);
		inputvalues(ep1.getSignin());
		
		
		ninethpage ep2 = new ninethpage(driver);
		inputvalues(ep2.getSignin());
		
		tenthpage tp2 = new tenthpage(driver);
		inputvalues(tp2.getSignin());
		
		eleventhpage ep3 = new eleventhpage(driver);
		inputvalues(ep3.getSignin());
		
		twelthpage ep4 = new twelthpage(driver);
		inputvalues(ep4.getSignin());
		
		thirteenpage ep5 = new thirteenpage(driver);
		inputvalues(ep5.getSignin());
		
		
		
	/*	implicitwait(20);
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

		*/
		
	}

	private static void inputvalues(WebElement signin) {
		// TODO Auto-generated method stub
		
	}

	private static void inputvalues(WebElement email, String string) {
		// TODO Auto-generated method stub
		
	}

	
		
}