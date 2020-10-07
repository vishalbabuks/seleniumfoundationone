package com.alertsandwindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class typeinalert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\foundationofselenium\\driver\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
		    
	    driver.get("http://demo.automationtesting.in/Alerts.html");
	    
	    driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
	    
	    driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	    
	    driver.switchTo().alert().sendKeys("test");
	    
	    driver.switchTo().alert().accept();

	}

}
