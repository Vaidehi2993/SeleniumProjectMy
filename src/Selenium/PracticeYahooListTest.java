package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeYahooListTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/?p=us");
		
		driver.manage().window().maximize();

		List<WebElement> LeftBox = driver.findElements(By.xpath("//ul[@class='Pos(r) List(n) Mt(10px)']//a"));
		System.out.println(LeftBox.size());
		
		for(int i=0; i<LeftBox.size(); i++) {
		System.out.println(LeftBox.get(i).getText());
		}
		
		// This loop generally use for list. they call for each loop.
		List<WebElement> RightBox = driver.findElements(By.xpath("//div[@id='header-nav-bar-wrapper']//a"));
		System.out.println(RightBox.size());
		
		for(WebElement Links : RightBox ){
		System.out.println(Links.getText());
		}
		
		
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
