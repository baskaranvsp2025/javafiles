package com.Maven_Project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;

public class Baseclass {

	public static WebDriver driver;
	private static String WebElementname;
	private static Object SendKeys;
	


	public static WebDriver browserlaunch(String name) {
		
		
		if (name.equalsIgnoreCase("chrome")) {
			
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		//driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		else if (name.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "Driver\\FirefoxDriver.exe");

			WebDriver driver = new FirefoxDriver();



			driver.manage().window().maximize();
			
		}
		return driver;			
		
			
	}

	public static void launchurl(String url) {

		driver.get(url);
		
	}

	public static void closebrowser() {
		driver.close();
						
			}
	
	public static void quitbrowser() {
		driver.quit();
	}

	public static void currenturl() {
		driver.getCurrentUrl();
		
	}
	public static void currenttitle() {
		driver.getTitle();
		
	}
	
	public static void navigateto(String url) {
		driver.navigate().to(url);
						
			}
	
	public static void navigateback(String url) {
		driver.navigate().back();
						
			}
	public static void navigateforward(String url) {
		driver.navigate().forward();
						
			}
	
	public static void sendkey(WebElement element, String values) {
		element.sendKeys(values);

	}
	
	public static void refresh()
	{
		driver.navigate().refresh();
						
	}

	public static void simplealert (String url)
	{
		
		driver.switchTo().alert().accept();
			
	}
		
	public static void confirmalert (String url)
	{
		
		if (url.equalsIgnoreCase("ok")) {
			
		
			driver.switchTo().alert().accept();
			
		}
		else if (url.equalsIgnoreCase("cancel")) {
	
			driver.switchTo().alert().dismiss();
				
		}
		
		
	}
	
	public static void promptalert(WebElement element, String value) {
		driver.switchTo().alert();
		element.sendKeys(value);	
		
	}
	
	

	public static void singleclick(WebElement clickbutton)
	{
		Actions singleclick = new Actions (driver);
		singleclick.click(clickbutton).build().perform();
		
						
	}
	
	public static void doubleclick(WebElement clickbutton)
	{
		Actions doubleclick = new Actions (driver);
		doubleclick.doubleClick(clickbutton).build().perform();
		
						
	}
	
	public static void rightclick(WebElement clickbutton)
	{
		Actions rightclick = new Actions (driver);
		rightclick.contextClick(clickbutton).build().perform();
		
						
	}
	
	public static void click(WebElement element) {
		element.click();
		
	}
	

	public static void screenshot(String location) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(location);
		FileUtils.copyFile(src, dest);
		
		
	}
	
	public static void implicitwait(long value) {
		driver.manage().timeouts().implicitlyWait(value, TimeUnit.SECONDS);
		
	}
	
	public static void selecttoindex(int indexvalue) {
		Select s1 = new Select(null);
		s1.selectByIndex(indexvalue);
		
		
	}
	
	public static void isselect(WebElement element) {
		System.out.println("Is Selected value is:" + element.isSelected());

	}
	
	
	public static void waitthread(int a) throws InterruptedException {
		Thread.sleep(a);
	}	
	
	
	
}
