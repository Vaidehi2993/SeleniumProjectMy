package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.linkText("About")).click(); //when we have static link we use linktext.
		driver.findElement(By.partialLinkText("bou")).click(); //when we have perticular portion is cahnging we use partiallinktext
		
		Thread.sleep(2000);
		
		String expectedTitle = "Google - About Google, Our Culture & Company News"; //when we have to match titile. tilte can find in head.
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		String expectedUrl = "https://about.google/";
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		if(expectedTitle.equals(actualTitle) & expectedUrl.equals(actualUrl)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}
	}

}
