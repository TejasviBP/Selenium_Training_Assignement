package a8_JavaScriptExcecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import a2_SeleniumBasicsAndInvokingDifferentBrowsers.A1_UseDifferentDrivers;

public class OperationsUsingJs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WebDriver driver =A1_UseDifferentDrivers.launchBrowser();
       driver.get("http://demo.automationtesting.in/Frames.html");
     
       JavascriptExecutor js= (JavascriptExecutor)driver;
      String title= js.executeScript("return document.title").toString();
      System.out.println("title of page is  " +title);
      String url= js.executeScript("return document.URL").toString();
      System.out.println("url of page is ");
      System.out.println(url);
      String domain= js.executeScript("return document.domain").toString();
      System.out.println("domain of page is  " +domain);
	}
}
