package com.workingwithcbrbdd;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ddexample {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\foundationofselenium\\driver\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
		    
	    driver.get("http://demo.automationtesting.in/Register.html");
JavascriptExecutor jsx=(JavascriptExecutor) driver;
		
		jsx.executeScript("window.scrollBy(0,600)", "");
	    WebElement e=driver.findElement(By.xpath("//select[@class='form-control ng-pristine ng-untouched ng-valid']"));
	    
	    Select s=new Select(e);
	    
	    s.selectByIndex(1);
	    s.selectByValue("Adobe InDesign");
	    s.selectByVisibleText("Android");
	    
	}
	
	}
	
	
	//input[@name='radiooptions']
	//input[@value='Male']
	//input[@value='FeMale']
	
	//input[@type='checkbox']
			



