package a6_ExceptionHandling;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import a2_SeleniumBasicsAndInvokingDifferentBrowsers.A1_UseDifferentDrivers;

public class Example1 {

	public static void main(String[] args) {
		// NoSuchElementException

		WebDriver driver= A1_UseDifferentDrivers.launchBrowser();
		driver.get("http://www.myntra.com");
		
		try {
	
		WebElement searchBox = driver.findElement(By.xpath("//input[@class='desktop-searchBa']")); 
		searchBox.click();
		}  catch(Exception e) {
			System.out.println("Error message is: "+e.getMessage());
		}
		driver.quit();
	}

}
