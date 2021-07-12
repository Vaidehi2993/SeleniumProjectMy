package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeNike {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.nike.com/ca/");
		
		WebElement men = driver.findElement(By.xpath("//ul[@class='pre-desktop-menu']/li[2]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(men).build().perform();
		
		Thread.sleep(2000);
		
		List<WebElement> alloptions = driver.findElements(By.xpath("//div[@id='DesktopMenu-0-1-0']/div[1]/div[2]/a"));
		
		System.out.println(alloptions.size());
		
		for(WebElement shoes : alloptions) {
		System.out.println(shoes.getText());
		
		}
	}
	
}
