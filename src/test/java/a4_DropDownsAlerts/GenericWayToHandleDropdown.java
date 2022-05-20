package a4_DropDownsAlerts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import a2_SeleniumBasicsAndInvokingDifferentBrowsers.A1_UseDifferentDrivers;

public class GenericWayToHandleDropdown {

	public static void main(String[] args) {
		WebDriver driver = A1_UseDifferentDrivers.launchBrowser();

		driver.get("http://demowebshop.tricentis.com/login");
		driver.findElement(By.linkText("Apparel & Shoes")).click();
		//use webelements for different elements
		WebElement sortBy= driver.findElement(By.id("products-orderby"));
		selectOption(sortBy, "Created on");
		System.out.println("Implemented successfully");
		driver.quit();
	}
	//use method
	public static void selectOption(WebElement ele, String value) {
		Select drp=new Select(ele);
		List<WebElement>options=drp.getOptions();
		for(WebElement option:options) {
			if(option.getText().equals(value)) {
				option.click();
				break;
			}
		}
	}
}
