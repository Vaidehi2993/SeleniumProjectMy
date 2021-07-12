package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeGmailLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.manage().window().maximize();
	
		driver.findElement(By.id("identifierId")).sendKeys("hjudfbhdsk");
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		
		Thread.sleep(2000);
		
		String Expectederr = "Couldn't find your Google Account";
		String Actualerr = driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
		System.out.println(Actualerr);
		
		if(Expectederr.equals(Actualerr)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
			
		}
		
		Thread.sleep(2000);
		driver.close();

	}

}
