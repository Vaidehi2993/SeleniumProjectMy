package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookSignupTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		
		//enterlastname
		driver.findElement(By.name("lastname")).sendKeys("hyudnjs");
		//enter 10 didgit mobile Name
		driver.findElement(By.name("reg_email__")).sendKeys("156727536");
		//enter password
		driver.findElement(By.name("reg_passwd__")).sendKeys("hskdkslfe");
		//click on sign up button
		driver.findElement(By.name("websubmit")).click();
		
	}

}
