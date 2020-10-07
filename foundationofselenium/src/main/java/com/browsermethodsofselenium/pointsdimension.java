package com.browsermethodsofselenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pointsdimension {

	public static void main(String[] args) {
		
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\foundationofselenium\\driver\\chromedriver.exe");
				
		       WebDriver driver=new ChromeDriver();
		       driver.get("https://www.airbnb.co.in/");
		       
		       Dimension d=new Dimension(411, 731);
		       
		       Point p=new Point(454,487);
		       
		       driver.manage().window().setPosition(p);
		       
		       driver.manage().window().setSize(d);
		       
		       Point poin=driver.manage().window().getPosition();
		       
		       Dimension dim=driver.manage().window().getSize();
		       
		       System.out.println(poin);
		       System.out.println(dim);

	}

}
