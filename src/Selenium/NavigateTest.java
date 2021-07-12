package Selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
	
		FirefoxDriver driver = new FirefoxDriver();
		
		//driver.get("https://www.facebook.com/"); 
		
		//driver.get and driver.navigate.to are the same but navigate has many other methods as well like back, forward, referesh etc.
		
		driver.navigate().to("https://www.facebook.com");
		
		

	}

}
