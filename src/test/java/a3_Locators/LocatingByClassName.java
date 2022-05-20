package a3_Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import a2_SeleniumBasicsAndInvokingDifferentBrowsers.A1_UseDifferentDrivers;

public class LocatingByClassName {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= A1_UseDifferentDrivers.launchBrowser();
		driver.get("https://www.flipkart.com/");

		List<WebElement> links=driver.findElements(By.className("eFQ30H"));
		System.out.println("Total number of links present: "+links.size());
		System.out.println();

		for(int i=0; i<links.size(); i++) {
			String text= links.get(i).getText();
			if(text.isEmpty()) {
				System.out.println(i+"th link text is : [not accessible or not present]");
			}
			else	
				System.out.println(i+"th link text is : "+text);
		}
		Thread.sleep(3000);
		driver.quit();	

	}

}
