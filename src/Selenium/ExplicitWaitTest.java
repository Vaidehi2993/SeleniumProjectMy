package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/javascript4.htm");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //for implicitlywait
		
		WebDriverWait  wait = new WebDriverWait(driver,20);//for explicit wait
		
		driver.findElement(By.name("B2")).click();
	
		wait.until(ExpectedConditions.alertIsPresent()); //for explicit wait
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		
		//al.accept();  Either accpet or dimiss you can use.
		
		al.dismiss();

	}

}
