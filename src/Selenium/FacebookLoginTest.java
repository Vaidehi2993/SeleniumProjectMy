package Selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		//className  - Notworking
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("hfhkkjgr"); //we have space in class name We cannot use classname directly.
		
		//CSS
		//driver.findElement(By.cssSelector(" ")) // needs to learn the syntax for css.
		
		//id - working
		//driver.findElement(By.id("email")).sendKeys("nkdsls");
		
		//LinkText
		//driver.findElement(By.linkText(" ")) - only for links
		
		//Name - Working 
		//driver.findElement(By.name("dfkjf"))
		
		//PartialLinkText - Only for links
		//driver.findElement(By.partialLinkText(" "))
		
		//Tagname - it should be unique or first one
		//driver.findElement(By.tagName("input"))
		
		//Xpath - we need to learn syntax for Xpath
		//driver.findElement(By.xpath(" "))
		
	}

}
