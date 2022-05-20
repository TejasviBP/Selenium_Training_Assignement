package a9_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import a2_SeleniumBasicsAndInvokingDifferentBrowsers.A1_UseDifferentDrivers;

public class ActionsClassDemo {

	public static void main(String[] args) {
		WebDriver driver= A1_UseDifferentDrivers.launchBrowser();
		driver.get("http://www.myntra.com");
		WebElement men= driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/a"));
		Actions act= new Actions(driver);
		act.moveToElement(men).build().perform(); // Here build is otional because here only one action is associated

	}

}
