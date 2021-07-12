package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.driver","/Users/vaidehipatel/Desktop/SeleniumJars/Chromedriver");
		
		//ClassName ObjName = new ClassName();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("jhgtuiomn");
		driver.findElement(By.id("pass")).sendKeys("Pateluytr");
		driver.findElement(By.name("login")).click();

	}

}
