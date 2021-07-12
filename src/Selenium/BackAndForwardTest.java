package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BackAndForwardTest {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.gecko.driver", "/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		
		driver.findElement(By.linkText("About")).click(); //title for About page
		wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
		System.out.println(driver.getTitle());
		
		driver.navigate().back();  //go back to google page title
		wait.until(ExpectedConditions.titleIs("Google"));
		System.out.println(driver.getTitle());
		
		driver.navigate().forward(); //title for about page again
		wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
		System.out.println(driver.getTitle());
		
		
		driver.close();

	}

}
