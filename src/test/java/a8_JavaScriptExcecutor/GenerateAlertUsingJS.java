package a8_JavaScriptExcecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import a2_SeleniumBasicsAndInvokingDifferentBrowsers.A1_UseDifferentDrivers;

public class GenerateAlertUsingJS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= A1_UseDifferentDrivers.launchBrowser();	
		JavascriptExecutor js= (JavascriptExecutor) driver;

		driver.get("http://demo.t3-framework.org/joomla30/index.php/en/joomla-pages/sample-page-2/login-page");
		driver.findElement(By.id("username")).sendKeys("mngr34926");
		driver.findElement(By.id("password")).sendKeys("amUpenu");
		WebElement button= driver.findElement(By.xpath("//button[@type='submit']"));

		js.executeScript("arguments[0].click();", button);
		   js.executeScript("alert('Welcome to Guru99');");
	}

}
