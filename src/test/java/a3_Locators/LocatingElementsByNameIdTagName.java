package a3_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import a2_SeleniumBasicsAndInvokingDifferentBrowsers.A1_UseDifferentDrivers;

public class LocatingElementsByNameIdTagName {

	public static void main(String[] args) {
		WebDriver driver= A1_UseDifferentDrivers.launchBrowser();
		driver.get("https://demo.guru99.com/test/login.html");
		WebElement username = driver.findElement(By.id("email"));
		username.click();
		username.sendKeys("8793512723");
		WebElement password = driver.findElement(By.name("passwd"));
		password.click();
		password.sendKeys("Tejasvi@123");
		WebElement loginButton = driver.findElement(By.tagName("button"));
		loginButton.click();
		
		driver.close();
		
	}

}
