package a3_Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import a2_SeleniumBasicsAndInvokingDifferentBrowsers.A1_UseDifferentDrivers;

public class LocatingElementsByLinkTextAndPartialLinkText {

	public static void main(String[] args) {

		WebDriver driver= A1_UseDifferentDrivers.launchBrowser();
		driver.get("https://www.flipkart.com/");
		WebElement forgot=driver.findElement(By.linkText("Forgot?"));
		System.out.println(forgot.isDisplayed());
		WebElement TermsOfUse=driver.findElement(By.partialLinkText("Terms"));
		System.out.println(TermsOfUse.isDisplayed());
		driver.quit();

	}

}
