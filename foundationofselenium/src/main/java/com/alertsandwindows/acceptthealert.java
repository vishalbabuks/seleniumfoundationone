package com.alertsandwindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class acceptthealert {
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\foundationofselenium\\driver\\chromedriver.exe");
	
    WebDriver driver=new ChromeDriver();
	    
    driver.get("http://demo.automationtesting.in/Alerts.html");
    
    driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
    
    String textofalert=driver.switchTo().alert().getText();
    
    System.out.println(textofalert);
    
    driver.switchTo().alert().accept();
    
    
  //button[@class='btn btn-danger']
  //button[@class='btn btn-primary']
  //p[@id='demo']
  //button[@class='btn btn-info']
    
  //a[text()='Alert with OK ']
  //a[text()='Alert with OK & Cancel ']
  //a[text()='Alert with Textbox ']
		

	}

}
