package com.webelemethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\foundationofselenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.softwaretestingmaterial.com");
		
		JavascriptExecutor jsx=(JavascriptExecutor) driver;
		
		jsx.executeScript("window.scrollBy(0,600)", "");
		
		//jsx.executeScript("window.scrollBy(-600,0)","");
		
		System.out.println("Script done");

	}

}
