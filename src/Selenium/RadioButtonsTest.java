package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		driver.manage().window().maximize();
		
		List<WebElement> allRadioButtons = driver.findElements(By.name("group1"));
		System.out.println(allRadioButtons.size());
	
		for(WebElement a : allRadioButtons) {
			System.out.println(a.getAttribute("value")+"--------"+a.isSelected());
			
		allRadioButtons.get(2).click();
	
		}
		
		System.out.println("--------------");
		
		for(WebElement a : allRadioButtons) {
			System.out.println(a.getAttribute("value")+"--------"+a.isSelected());

		}
		
		driver.close();
	}

}
