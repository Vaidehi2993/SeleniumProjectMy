package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeAmazonDropdownTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/");
		
		driver.manage().window().maximize();
		
		List<WebElement> AllOptions = driver.findElements(By.xpath("//select[@id='searchDropdownBox']/option"));
		System.out.println(AllOptions.size());
		
		for(WebElement a : AllOptions) {
			System.out.println(a.getText()+"-------"+a.isSelected());
		} 

		WebElement box = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(box);
		Thread.sleep(2000);
		s.selectByValue("search-alias=beauty");
		Thread.sleep(2000);
		s.selectByIndex(15);
		
		Thread.sleep(2000);
		driver.close();
	}

}
