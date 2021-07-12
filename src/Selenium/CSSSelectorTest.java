package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSSelectorTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("fjgsdfj");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("hskdkslfe");
		driver.findElement(By.cssSelector("div[class='_6ltg']>button")).click();

	}

}
