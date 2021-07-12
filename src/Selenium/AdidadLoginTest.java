package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdidadLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.adidas.ca/en/account-login");
		
		driver.manage().window().maximize();
		
		driver.navigate().refresh();
		
		driver.findElement(By.id("login-email")).sendKeys("hdnncs@gmaik.com");
		driver.findElement(By.id("login-password")).sendKeys("jdgehrnen");
		
		driver.findElement(By.xpath("//button[@data-auto-id='login-form-login']")).click();
		
		Thread.sleep(2000);
		
		//Verify Error Message
		String expectedErr = "Incorrect email/password – please check and retry";
		String actualErr = driver.findElement(By.xpath("//div[@data-auto-id='login-error-message']")).getText();
		System.out.println(actualErr);
		
		if(expectedErr.equals(actualErr)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
			
		}
		
		Thread.sleep(2000);
		driver.quit();
	}

}
