package a4_DropDownsAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import a2_SeleniumBasicsAndInvokingDifferentBrowsers.A1_UseDifferentDrivers;

;

public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = A1_UseDifferentDrivers.launchBrowser();
		
		driver.get("http://demowebshop.tricentis.com/login");
		 driver.findElement(By.linkText("Apparel & Shoes")).click();
		 WebElement sortBy= driver.findElement(By.id("products-orderby"));
		 Select sortedBy = new Select(sortBy);
		 //sortedBy.selectByIndex(1);
		// sortedBy.selectByValue("http://demowebshop.tricentis.com/apparel-shoes?orderby=5");
			sortedBy.selectByVisibleText("Created on");
			System.out.println("Test successful");
			driver.quit();
	}

}
