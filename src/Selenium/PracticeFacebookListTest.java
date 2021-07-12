package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeFacebookListTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li/a"));
		System.out.println(allLinks.size());
		
		for(int i=0; i<allLinks.size(); i++) {
		System.out.println(allLinks.get(i).getText());
		
		}
		
		Thread.sleep(2000);
		driver.close();
	}

}
