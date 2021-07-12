package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
		//don't move your cursor during running and keep cursor on top corner
		//To Perform hover we use Action inbuild selenium class and use method movetoelement.
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement electronics = driver.findElement(By.linkText("Electronics"));
		
		Actions builder = new Actions(driver);  //Action is the class in selenium
		builder.moveToElement(electronics).build().perform();
		
		Thread.sleep(2000);
		
		List<WebElement> allSearch = driver.findElements(By.xpath("(//nav[@aria-label='Top Categories'])[3]/ul/li"));
		System.out.println(allSearch.size());
		
		for(WebElement a : allSearch) {
			System.out.println(a.getText());
		}
	}

}
