package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.nike.com/ca/");
		
		WebElement men = driver.findElement(By.linkText("Men"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(men).build().perform();
		
		Thread.sleep(2000);
		
		List<WebElement> allShoesOptions = driver.findElements(By.xpath("//a[contains(@aria-label,'main-menu, Men, Shoes')]"));
		System.out.println(allShoesOptions.size());
		
		for(WebElement a : allShoesOptions)
		System.out.println(a.getText());
		

	}

}
