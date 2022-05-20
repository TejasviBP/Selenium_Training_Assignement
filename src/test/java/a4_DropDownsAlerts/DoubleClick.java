package a4_DropDownsAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import a2_SeleniumBasicsAndInvokingDifferentBrowsers.A1_UseDifferentDrivers;

public class DoubleClick {
	public static void main(String[] args) {
		WebDriver driver = A1_UseDifferentDrivers.launchBrowser();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement doubleClick =driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		Actions act= new Actions(driver);
		act.doubleClick(doubleClick).build().perform();
		
		Alert al= driver.switchTo().alert();
//		WebElement alert =driver.findElement(By.xpath("//*[@id=\"authentication\"]/script[5]"));
		String str= al.getText();
		System.out.println(str);
		al.accept();
		driver.quit();
	
	}
}
