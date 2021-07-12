package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultipleBrowserTest {

	public static void main(String[] args) throws IOException {
		
		//When we have to use multiplebrowser in a single time.
		
		String Browser = "Firefox";
		//FirefoxDriver driver;  //We have to call driver globally
		WebDriver driver; //declare globally  //he driver have null value when it will reach on line no. - 31 it has some value to run
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("/Users/vaidehipatel/Desktop/Selenium_WorkSpace/SeleniumProjectMy/src/Selenium/multibrowser.properties");
		
		prop.load(ip);
		
		if(Browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
			driver = new FirefoxDriver();
	
		} else if(Browser.equals("Firefox")) {
			System.setProperty("webdriver.Chrome.driver","/Users/vaidehipatel/Desktop/SeleniumJars/ChromeDriver");
			driver = new ChromeDriver();
		} else {
			System.setProperty("webdriver.Safari.driver","/Users/vaidehipatel/Desktop/SeleniumJars/SafariDriver");
			driver = new SafariDriver();
		}

		driver.get(prop.getProperty("url"));
		
		driver.findElement(By.id(prop.getProperty("email_id"))).sendKeys(prop.getProperty("email"));
		driver.findElement(By.id(prop.getProperty("password_id"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.name(prop.getProperty("login_name"))).click();
		
	}

}
