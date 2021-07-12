package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScotiaBankLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/vaidehipatel/Desktop/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=eDVzn3hWvPo&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvY2FcL2VuXC9wZXJzb25hbC5odG1sIiwib2F1dGhfa2V5IjoiZURWem4zaFd2UG8iLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTYxNTI2MTUyMywiaWF0IjoxNjE1MjYwMzIzLCJqdGkiOiJkMmNkZGJmNi0zYmIzLTRlN2ItOGFmNy02NTVjNmVlNzE5ZTkiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.GVdiFNYz_oXKTGKeP0yz48ajceWUQ7ahaYy2D9ZhzAGzo0MieQfF2S2VuMScf1MD2uhDWHmy2darJERpSCaK2P0fCF0Vrj4Cc3A7YiDkDFJLeIuDDGQFFI9Kohox-a_nKfxhUR4RA1eZkPqzxuY5xXVE9ywpGiumY2iSJxiqX1XXphrg1ZwqO6wvw2VpqE3e_d2rKOpGYyoGsEabaKFgtmMYQsLKoZvG3kUXzcpi6W3kRmTylNm3Nw8d8gY2bCfACgkg9hL-m1R4PKDj5AfBd1zjX7TJ4f3be06dSPRoXPDztb__CUAxVpDWLKLNW0n34zBq685sx2cMWLi0SLA2VA&preferred_environment=");
		
		//wrongemail
		driver.findElement(By.id("usernameInput-input")).sendKeys("xysgdtef");
		
		//wrongPass
		driver.findElement(By.id("password-input")).sendKeys("fgvxhdg");
	
		
		//Signuperror
		driver.findElement(By.id("signIn")).click();
		
		Thread.sleep(2000);
		
		String expectedErr = "Please check your card number / username or password and try again.";
		String actualErr = driver.findElement(By.id("globalError")).getText();
		System.out.println(actualErr);
		
		if(expectedErr.equals(actualErr)) {
			
			System.out.println("Test Pass");
			
		}else {
			
			System.out.println("Test Fail");
			
		}
		
	}

}