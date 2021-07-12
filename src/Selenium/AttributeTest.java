package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca");
		
		//First heck for text if no text then check for Attributes if we have more than 1 attributes check for right attributed which cahnging the value.
		
		String s = driver.findElement(By.id("gh-ac")).getAttribute("placeholder"); // To read default value
		System.out.println(s);
		
		driver.findElement(By.id("gh-ac")).sendKeys("iphone");
		System.out.println(driver.findElement(By.id("gh-ac")).getAttribute("value")); //To read what you have type by default will be getattributes("value").
		
		 
		

	}

}
