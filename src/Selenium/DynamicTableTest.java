package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTableTest {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//Number of Rows
		
		List<WebElement> Rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(Rows.size());
		
		//Number of Columns
		
		List<WebElement> Columns = driver.findElements(By.xpath("//table[@id='customers']//tr[2]/td"));
		System.out.println(Columns.size());
		
		for(int i=2; i<=Rows.size(); i++) {
			for(int j=1; j<=Columns.size(); j++) {
				System.out.print(driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]")).getText());
				System.out.print("  |  ");
			}
			System.out.println();
		}
		
		
	}

}
