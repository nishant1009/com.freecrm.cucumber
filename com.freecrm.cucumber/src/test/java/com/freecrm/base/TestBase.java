package com.freecrm.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {
	
	private String browser;
	private String url;
	WebDriver driver;
	
	public TestBase(String browser,String url){
		
		this.browser=browser;
		this.url=url;
		
	}
	
	public WebDriver initializeWebDriver(){
		
		//switch(browser.toLowerCase()){
		
		//case "chrome":
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\src\\test\\resources\\Drivers\\chromedriver78.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
			//break;
			
		//case "internetexplorer":
//			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+ "\\src\\test\\resources\\Drivers\\IEDriverServer.exe");
//			driver=new InternetExplorerDriver();
//			driver.manage().window().maximize();
//			driver.get(url);
//			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//			break;
		//}
		return driver;
	}
	
	
	public void sendKeys(WebDriver driver,By element, String value) {
		driver.findElement(element).sendKeys(value);
	}

	public void click(WebDriver driver,By element) {
		driver.findElement(element).click();
	}
	
	public String getText(WebDriver driver, By element){
		return driver.findElement(element).getText();
	}
	
	public boolean checkEnable(WebDriver driver, By element){
		return driver.findElement(element).isEnabled();
	}
	
	public void acceptPopupMsg(){
		driver.switchTo().alert().accept();
	}
	
	public String getPopupMsg(){
		
		return driver.switchTo().alert().getText();
	}

}
