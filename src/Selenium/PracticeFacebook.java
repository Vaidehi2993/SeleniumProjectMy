package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeFacebook {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		
	
	//	driver.findElement(By.name("lastname")).sendKeys("hyudnjs");
	//	driver.findElement(By.name("reg_email__")).sendKeys("156727536");
	//	driver.findElement(By.name("reg_passwd__")).sendKeys("hskdkslfe");
		
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByValue("6");
		
		WebElement day = driver.findElement(By.id("day"));
		Select d = new Select(day);
		d.selectByIndex(9);
		
		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByValue("2000");
		

	}

}
