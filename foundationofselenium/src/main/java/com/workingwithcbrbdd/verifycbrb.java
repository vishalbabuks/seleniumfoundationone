package com.workingwithcbrbdd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifycbrb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://demo.stqatools.com/");
		
		//Check element is displayed
		
		WebElement e=driver.findElement(By.xpath("//input[@id='studentname']"));
		
		Boolean isdisplayed=e.isDisplayed();
		
		System.out.println("Check whether the element is displayed or not"+isdisplayed);
		
		WebElement e1=driver.findElement(By.xpath("//input[@name='sex']"));
		
		Boolean isselected=e1.isSelected();
		
		System.out.println("Check whether the element is enabled or not"+isselected);

	}

}
