package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverText {

	public static void main(String[] args) throws InterruptedException {
		
		//webdriver is the interface
		
		System.setProperty("webdriver.gecko.driver", "/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		//ClassName objName = new ClassName();
		//FirefoxDriver driver = new FirefoxDriver();
		
		//interfaceName(Parent class) objName = new ClassName(); //any method we can use, both are same
		WebDriver driver = new FirefoxDriver();
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=opztjEyC7WE&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvY2FcL2VuXC9wZXJzb25hbC5odG1sIiwib2F1dGhfa2V5Ijoib3B6dGpFeUM3V0UiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTYxNTQzNjY1MywiaWF0IjoxNjE1NDM1NDUzLCJqdGkiOiI2NDNiNjA5Ni1jMzU4LTQ5OWMtODZjMy1hNGUyZTljNDRlNWYiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.dQBF8O07yZbH-DpdG77_c5Ai9FZn5FbyspjwMuzLXs2qw7xuM9PPHKP5VKNl0W6pThF97juQbm7pkXR6jQcthcTKAMOSVYRcE_8XOZ-N96NuHJYh7lgd-uJd9yovpVdYpLl5SCL3c_tui_mV0iLn106Y-ywWT8E_lcNeDf4Hv5Ydj4rUJORLNmO_jOm5RdBHkbXmWZCoG3NrKPJ_4Ujq-l2Bl5eKihmw_cvCrWKUFn7oWxa6GY9w-6rRHgvf3EFvyZRH9WkI6o2HkZIp8qatW14avAv0_zsIPHk8DC4cHpyxXNd-QxJOQVHWCwIjGkHvIS7hnL3jQO3jrjskNVpLFg&preferred_environment=");
		
		Thread.sleep(2000);

		driver.findElement(By.id("usernameInput-input")).sendKeys("xysgdtef");
		driver.findElement(By.id("password-input")).sendKeys("fgvxhdg");
		driver.findElement(By.id("signIn")).click();
		
	}

}
