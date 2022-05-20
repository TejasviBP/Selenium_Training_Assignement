package a3_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import a2_SeleniumBasicsAndInvokingDifferentBrowsers.A1_UseDifferentDrivers;

public class LocatingByXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= A1_UseDifferentDrivers.launchBrowser();
		driver.get("https://www.bing.com/");
		WebElement textField= driver.findElement(By.id("sb_form_q"));
		textField.sendKeys("Capgemini, India");
		textField.submit();
		
		WebElement address= driver.findElement(By.xpath("//*[@id=\"elc_eid_YN4070x408154415252700828\"]/div/div/div[2]/span[2]/div"));
		String text =address.getText();
		System.out.println("Address: "+text);
	  driver.quit();
	}

}
