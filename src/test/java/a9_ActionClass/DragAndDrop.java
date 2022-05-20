package a9_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import a2_SeleniumBasicsAndInvokingDifferentBrowsers.A1_UseDifferentDrivers;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver= A1_UseDifferentDrivers.launchBrowser();
		driver.get("https://demo.guru99.com/test/drag_drop.html");

		WebElement btn5000= driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement debitAcct= driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		
		
		Actions act= new Actions(driver);
		act.clickAndHold(debitAcct).moveToElement(btn5000).release().build().perform(); // Here build is mandatory 
	

		
	}

}
