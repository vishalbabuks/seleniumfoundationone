package com.alertsandwindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dismissingthealert {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\foundationofselenium\\driver\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
		    
	    driver.get("http://demo.automationtesting.in/Alerts.html");
	    
	    driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
	    
	    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	    
	    driver.switchTo().alert().dismiss();

	    String text=driver.findElement(By.xpath("//p[@id='demo']")).getText();
	    
	    System.out.println(text);
	}

}
