package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MississaugaTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://mississauga.ca/");

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//ul[@class='main-nav-links']/li[3]")).click();
		
		List<WebElement> allList = driver.findElements(By.xpath("//ul[@class='dropdown-menu nav-dropdown-menu show']/li"));
		System.out.println(allList.size());
		
		for(WebElement a : allList) {
			System.out.println(a.getText());
		}
	}

}
