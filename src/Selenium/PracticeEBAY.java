package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeEBAY {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
		List<WebElement> all = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		
		System.out.println(all.size());
		
		for(WebElement Categories : all) {
			System.out.println(Categories.getText());
		}
		

	}

}
