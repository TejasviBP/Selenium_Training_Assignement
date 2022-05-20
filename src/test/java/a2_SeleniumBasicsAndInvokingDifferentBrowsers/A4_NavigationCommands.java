package a2_SeleniumBasicsAndInvokingDifferentBrowsers;

import org.openqa.selenium.WebDriver;

public class A4_NavigationCommands {
	public static void main(String[] args) {
		WebDriver driver= A1_UseDifferentDrivers.launchBrowser();
        driver.get("http://www.flipkart.com/");
		String str=driver.getWindowHandle();
		System.out.println("Window handle name: "+driver.getWindowHandle());
		driver.navigate().forward();

		driver.navigate().to("http://www.myntra.com");
		driver.switchTo().window(str);
		driver.navigate().back();
		driver.navigate().refresh();
		System.out.println("Title of current page "+driver.getTitle());
	}
}
