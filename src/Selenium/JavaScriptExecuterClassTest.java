package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuterClassTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en");

		Thread.sleep(2000);
		
		WebElement aboutUs = driver.findElement(By.linkText("About Us"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	
		
		//To scorll this scroll bar. JavascriptExecutor is class in selenium.
		//Method - 1  Scroll Using X and Y cordinate  then after click.
		
		//jse.executeScript("window.scrollBy(0,4000)");
		//System.out.println(aboutUs.getLocation());
		//aboutUs.click();
		
		//Method - 2   Scroll until the element is in the view in true then after click.
		
		//jse.executeScript("argument[0].scrollIntoView(true);", aboutUs);
		//aboutUs.click();
		
		//Method - 3 directly find and click 
		
		jse.executeScript("argument[0].click();", aboutUs);
	}

}
