package com.browsermethodsofselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browsermethods {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\foundationofselenium\\driver\\chromedriver.exe");
		
       WebDriver driver=new ChromeDriver();
	    
        driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		String currentrul=driver.getCurrentUrl();
		System.out.println(currentrul);
		
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		
		driver.close();
		
		/*driver.navigate().to("https://login.salesforce.com/");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		*/

	}

}
