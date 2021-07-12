package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptAlert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/javascript4.htm");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("B2")).click();
		Thread.sleep(2000);
		
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		
		//al.accept();  Either accpet or dismiss you can use.
		
		al.dismiss();
		

	}

}
