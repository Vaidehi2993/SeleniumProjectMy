package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeZaraLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.zara.com/ca/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("LOG IN")).click();
		driver.findElement(By.name("email")).sendKeys("hdgtwhy@gmail.com");
		driver.findElement(By.name("password")).sendKeys("hdyejenbb");
		driver.findElement(By.xpath("//div[@class='form__footer']/button")).click();
		
		Thread.sleep(2000);

		String ExpectedOutput = "INVALID ACCESS DETAILS"; //when i check inspect elements all letters are in lower case and i do copy paste from html code it showing me error.
		String ActualOutput = driver.findElement(By.xpath("//span[text()='Invalid access details']")).getText(); //Not giving actualoutput
		
		System.out.println(ActualOutput);

		if(ExpectedOutput.equals(ActualOutput)){
			System.out.println("On Page");
		}else {
			System.out.println("Not On page");
		}
		
		driver.findElement(By.xpath("//button[@class='button']")).click();
		driver.findElement(By.xpath("//button[@class='button logon-view__alternate-section-button']")).click();
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
