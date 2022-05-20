package a2_SeleniumBasicsAndInvokingDifferentBrowsers;

import org.openqa.selenium.WebDriver;

public class A3_BrowserCommands {

	public static void main(String[] args) {
		WebDriver driver= A1_UseDifferentDrivers.launchBrowser();
		// there are 3 webDriver commands:
		// 1. browser command   2.navigation command  3.
		//Broswer commands are: total 6 
		//1
		driver.get("http://www.flipkart.com/");
		//2
		System.out.println("Title of page is: "+driver.getTitle());
		//3	
		System.out.println("Current url: "+driver.getCurrentUrl());
		//4
		String pageSource=driver.getPageSource();
		int a= pageSource.length();
		//5
		System.out.println("Length of page source is "+a);
		//6
		driver.close();
		String str=driver.getWindowHandle();
		System.out.println("Window handle name: "+driver.getWindowHandle());
		driver.navigate().forward();

		driver.navigate().to("http://www.myntra.com");
		//System.out.println("Window handle name: "+driver.getWindowHandle());
		driver.switchTo().window(str);
		driver.navigate().back();
	}
}
