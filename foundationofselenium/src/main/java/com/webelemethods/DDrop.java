package com.webelemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\foundationofselenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://stqatools.com/demo/Drag&Drop.php");
		
		By drage=By.xpath("//img[@id='dragA']");
		
		By target=By.xpath("//div[@id='dropBox']");
		
		WebElement e=driver.findElement(drage);
		WebElement e1=driver.findElement(target);
		
		
		Actions a=new Actions(driver);
		a.dragAndDrop(e, e1);

	}

}
