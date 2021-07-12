package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;   //Hover from firefox driver

public class SeleniumFirstClass {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver","/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("jhgtuiomn");
		driver.findElement(By.id("pass")).sendKeys("Pateluytr");
		driver.findElement(By.name("login")).click();
		
	}
	
		

}
