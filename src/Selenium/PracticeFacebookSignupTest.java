package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeFacebookSignupTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("jskhfshw");
		driver.findElement(By.name("lastname")).sendKeys("hjfshfjs");
		driver.findElement(By.name("reg_email__")).sendKeys("784304929");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select m = new Select(month);
		Thread.sleep(2000);
		m.selectByValue("6");
		
		WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
		Select d = new Select(date);
		Thread.sleep(2000);
		d.selectByValue("12");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select y = new Select(year);
		Thread.sleep(2000);
		y.selectByVisibleText("2012");
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		Thread.sleep(2000);
		driver.close();
	
	}

}
