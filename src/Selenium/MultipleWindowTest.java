package Selenium;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://moodle.cestarcollege.com/moodle/");
	
	
		driver.findElement(By.linkText("Faq")).click();
		
		Set<String> allWindows = driver.getWindowHandles();  //Here we can not use List we cant use index.
		System.out.println(allWindows.size());
		
		Iterator<String> iter = allWindows.iterator(); //for Set of string we have inbuild iterator method.
		
		String parentWindow = iter.next();//we iter.next for set of string if its here list we have to use get();
		String childWindow = iter.next();
		System.out.println(parentWindow);
		System.out.println(childWindow);
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		
		driver.close(); //will only close window where you are we can use driver after using close.
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		
		driver.quit(); //will kill driver we can't use any driver after using quite.	
	

	}

}
