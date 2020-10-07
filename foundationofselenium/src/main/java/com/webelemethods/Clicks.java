package com.webelemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clicks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\foundationofselenium\\driver\\chromedriver.exe");
		

		
		//open the browser
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://beej.us/blog/data/drag-n-drop/");
		
		driver.manage().window().maximize();
		
		By source=By.xpath("//img[@id='goat2']");
		By dest=By.xpath("//img[@id='goat3']");
		
		WebElement mysource=driver.findElement(source);
		WebElement mydestination=driver.findElement(dest);
		
		Actions a=new Actions(driver);
				
		a.dragAndDropBy(mydestination, 150, 150).perform();
		
		a.dragAndDrop(mysource, mydestination).perform();
		
		
		
		
	}

}
