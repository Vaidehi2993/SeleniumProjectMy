package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ZaraLoginTest {

	public static void main(String[] args) {
		
		System.getProperty("webdriver.gecko.driver","/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.zara.com/ca/en/logon");
		
		driver.findElement(By.name("logonId")).sendKeys("jhdsidisjd");
		driver.findElement(By.name("password")).sendKeys("fhjgfiukzd");
		
		driver.findElement(By.xpath("//button[@class='button logon-view__form-button']")).click();
	}

}
