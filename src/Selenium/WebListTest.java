package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//when we have to print first element.
		//WebElement links = driver.findElement(By.tagName("a")); //When we hover findElement we only find Webelement
		//WebElement links = driver.findElement(By.tagName("agftgy")); - will show error with unable to find elements. WebElement must be unique and present aor first one.
		
		//when we have to print all links from page. Will search for all the elements which has tagname "a" will save in alllinks.
		List<WebElement> allLinks = driver.findElements(By.tagName("a")); //When we hover findelements it will show list<Webelement> like arraylist<string>
		System.out.println(allLinks.size());
		//List<WebElement> allLinks = driver.findElements(By.tagName("adfdggdg"));  - Code will be run & give result of 0. When its list of webElement if not find matching note will show size 0.
		//System.out.println(allLinks.size());
		
		
		/*System.out.println(allLinks.get(0).getText());
		System.out.println(allLinks.get(1).getText());
		System.out.println(allLinks.get(2).getText());*/
		
		//we use for loop
		
		for(int i=0; i<allLinks.size(); i++) {
		System.out.println(allLinks.get(i).getText());
			
		}
		
		System.out.println("---------2nd program for Left Footer---------");
		
		WebElement LeftFooter = driver.findElement(By.xpath("//div[@class='KxwPGc AghGtd']"));
		List<WebElement> alllinks = LeftFooter.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		
		for(int i=0; i<alllinks.size(); i++) {
		System.out.println(alllinks.get(i).getText());
			
		}
		
		System.out.println("---------2nd program with easy method---------");
		
		List<WebElement> allinks = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));
		System.out.println(allinks.size());
	
		for(int i=0; i<allinks.size(); i++) {
		System.out.println(allinks.get(i).getText());
			
		}
		driver.close();
	}

}
