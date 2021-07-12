package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeNikeLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.nike.com/login");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("emailAddress")).sendKeys("hjdkulldb@gmail.com");
		driver.findElement(By.name("password")).sendKeys("hyfkdn");
		driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();
		
		
		Thread.sleep(2000);
		String ExpectedErr = "Your email or password was entered incorrectly.";
		String ActualErr = driver.findElement(By.xpath("//div[@class='nike-unite-error-message errorMessage nike-unite-component']")).getText();
		System.out.println(ActualErr);
		
		if(ExpectedErr.equals(ActualErr)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		Thread.sleep(2000);
		driver.close();
	}

}


