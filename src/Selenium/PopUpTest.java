package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");

		List<WebElement> popUp = driver.findElements(By.className("btn-close"));
	
		if(popUp.size()>0) {
		  popUp.get(0).click();
		}
		
		driver.findElement(By.id("search-key")).sendKeys("computer");
		
	}

}
