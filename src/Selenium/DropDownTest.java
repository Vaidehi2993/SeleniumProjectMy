package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		driver.manage().window().maximize();
		
		List<WebElement> AllCategory = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(AllCategory.size());
		
		for(WebElement Name : AllCategory) {
			System.out.println(Name.getText());
		} 
			
		System.out.println("--------weather it is selected or not(iselected loop)--------");
		
		List<WebElement> AllOptions = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(AllOptions.size());
		
		for(WebElement a : AllOptions) {
			if(a.isSelected())
			System.out.println(a.getText()+"-------"+a.isSelected());
		} 
		
		WebElement box = driver.findElement(By.id("gh-cat")); //Always write element which had select TAG
		Select s = new Select(box); //Inbuild Class select in selenium and when we create new select object they pass the webelement where we want to select. 
		s.selectByIndex(6); //We can use any of this method
		Thread.sleep(2000);
		s.selectByValue("11116");
		Thread.sleep(2000);
		s.selectByVisibleText("Home & Garden");
		Thread.sleep(2000);
		
		System.out.println("------After Selection------"); 
		
		for(WebElement a : AllOptions) { //when we select for after something selection will print the last selection before FOR LOOP. Java execute line by line.
			if(a.isSelected())
			System.out.println(a.getText()+"-------"+a.isSelected());
		} 
		}

	}

