package a4_DropDownsAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import a2_SeleniumBasicsAndInvokingDifferentBrowsers.A1_UseDifferentDrivers;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = A1_UseDifferentDrivers.launchBrowser();
		
		  driver.get("http://demo.automationtesting.in/Alerts.html");
		   driver.manage().window().maximize();
		   driver.findElement(By.partialLinkText("Alert with Textbox")).click();
		   driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		   Thread.sleep(3000);
		   Alert alert=driver.switchTo().alert();
		   alert.sendKeys("tejasvi");
	      	alert.accept();
	      	driver.quit();
	}

}
