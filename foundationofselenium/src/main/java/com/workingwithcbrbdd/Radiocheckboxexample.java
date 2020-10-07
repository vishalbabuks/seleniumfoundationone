package com.workingwithcbrbdd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiocheckboxexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\foundationofselenium\\driver\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
		    
	    driver.get("http://demo.automationtesting.in/Register.html");
	    
	    WebElement e=driver.findElement(By.xpath("//input[@name='radiooptions']"));
	    String element=e.getText();
	    System.out.println(element);
	    
	    WebElement M=driver.findElement(By.xpath("//input[@value='Male']"));
	    WebElement F=driver.findElement(By.xpath("//input[@value='FeMale']"));
	    
	    M.click();
	    M.isEnabled();
	    M.isSelected();
	    M.isDisplayed();
	    
	    
	    

	}

}
