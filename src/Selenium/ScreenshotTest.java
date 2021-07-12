package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotTest {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver","/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/");
		
		//When our script is fail and any error we are getting that time we have to take screen shot.
		
		//Screenshot will first save in Java we have to copy that and save into our computer.
		
		File scrFile = driver.getScreenshotAs(OutputType.FILE); //Inbuild method in JAVA.
		//File scrFile = ((TakeScreenShot)driver).getScreenshotAs(OutputType.FILE); //This line is for WebDriver.
		FileUtils.copyFile(scrFile, new File("/Users/vaidehipatel/Desktop/Testing/screenshot1.png"));

	}

}
