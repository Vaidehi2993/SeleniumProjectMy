package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");

		List<WebElement> sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		
		if(sortable.size()>0) {
			System.out.println("sortable is Present");
		} else {
			System.out.println("sortable is not Present");
		}
		
		List<WebElement> droppable = driver.findElements(By.id("droppable"));
		System.out.println(droppable.size());
		
		if(sortable.size()>0) {
			System.out.println("droppable is Present");
		} else {
			System.out.println("droppable is not Present");
		}
		
		//driver.switchTo().frame(0); //only use with index
		//driver.switchTo().frame("demo-frame"); //this one only use with id and name. In this case we can't use it
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		System.out.println("---------After switching to frame----------");
		
		sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		
		if(sortable.size()>0) {
			System.out.println("sortable is Present");
		} else {
			System.out.println("sortable is not Present");
		}
		
		droppable = driver.findElements(By.id("droppable"));
		System.out.println(droppable.size());
		
		if(sortable.size()>0) {
			System.out.println("droppable is Present");
		} else {
			System.out.println("droppable is not Present");
			
		driver.switchTo().defaultContent(); //When we want to switch back to on main page. 
		
		System.out.println("---------After switching to frame----------");
		
		sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		
		if(sortable.size()>0) {
			System.out.println("sortable is Present");
		} else {
			System.out.println("sortable is not Present");
		}
		
		droppable = driver.findElements(By.id("droppable"));
		System.out.println(droppable.size());
		
		if(sortable.size()>0) {
			System.out.println("droppable is Present");
		} else {
			System.out.println("droppable is not Present");
			
		}
		
		driver.switchTo().parentFrame(); //When we have frame inside frame when you have to go back to immediate frame use parentframe method 
		//when we have to go back on main frame use default method.
		}
	}

}
