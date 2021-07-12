package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeFacbookLinks {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		List<WebElement> footerLinks = driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li/a"));
		System.out.println(footerLinks.size());

		for(int i=0; i<footerLinks.size(); i++) {
		System.out.println(footerLinks.get(i).getText());
		
	}

}
}