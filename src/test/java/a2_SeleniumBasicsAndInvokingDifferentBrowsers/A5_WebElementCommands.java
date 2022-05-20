package a2_SeleniumBasicsAndInvokingDifferentBrowsers;

import org.apache.commons.io.FileSystemUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class A5_WebElementCommands {

	public static void main(String[] args) {
		WebDriver driver= A1_UseDifferentDrivers.launchBrowser();
		driver.get("http://www.myntra.com");
		WebElement searchBox = driver.findElement(By.xpath("//input[@class='desktop-searchBar']")); 
		searchBox.click();
		searchBox.sendKeys("Shoes");
		System.out.println(searchBox.getTagName());
		System.out.println(searchBox.getText());
		driver.quit();

	}

}
