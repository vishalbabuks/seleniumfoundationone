package com.webelemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		By loginbutton=By.xpath("//button[@name='login']");
		By clname=By.className("inputtext _55r1 _6luy");
		By id=By.id("pass");
		By name=By.name("login");
		By tagname=By.tagName("a");
		By css=By.cssSelector("");
		By linktxt=By.linkText("Create a Page");
		By partialtxt=By.partialLinkText("Create");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\foundationofselenium\\driver\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/");
	   
	    /*WebElement e=driver.findElement(partialtxt);
	    e.click();
	    
	   WebElement lt=driver.findElement(linktxt);
	    lt.click();*/
	   
	    WebElement tn=driver.findElement(loginbutton);
	    String atags=tn.getText();
	    System.out.println(atags);
	    
	    
	    WebElement lb=driver.findElement(name);
	    String bgcolor=lb.getCssValue("background-color");
	    System.out.println(bgcolor);
	    
	    WebElement txb=driver.findElement(id);
	    String att=txb.getAttribute("placeholder");
	    System.out.println(att);
	    
	    WebElement passb=driver.findElement(id);
	    String tname=passb.getTagName();
	    System.out.println(tname);
	    
	    WebElement ip=driver.findElement(id);
	    ip.sendKeys("testing");
	    
	    WebElement logb=driver.findElement(loginbutton);
	    logb.sendKeys(Keys.ENTER);
	    
	
	    
	    
	}

}
