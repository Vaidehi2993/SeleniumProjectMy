package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		//Whether we want to verify ELEMENT IS PRESENT or NOT we use list.
		
			//we can not use below method as if webelement will be change it will give error of unable to locate.
			/*if(driver.findElement(By.linkText("Aboutsedteds")).isDisplayed()) {
			System.out.println("Element Present");
			}else {	
			System.out.println("Element Not Present");
			}*/
		
		List<WebElement> element = driver.findElements(By.linkText("About")); //we can use another element as well - Anouftf
		System.out.println(element.size());
		
		if(element.size()>0) {
			System.out.println("Element Present");
			
		}else {
			System.out.println("Element not present");
		}
		
		driver.close();
	}

}
