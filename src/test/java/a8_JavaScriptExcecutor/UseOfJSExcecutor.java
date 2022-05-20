package a8_JavaScriptExcecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import a2_SeleniumBasicsAndInvokingDifferentBrowsers.A1_UseDifferentDrivers;


public class UseOfJSExcecutor {

	public static void main(String[] args) {
		// JavaScriptExecutor is an Interface that helps to execute JavaScript through Selenium Webdriver.
		//JavaScriptExecutor provides two methods “executescript” & “executeAsyncScript” to handle.
		WebDriver driver=A1_UseDifferentDrivers.launchBrowser();			
		
        //Creating the JavascriptExecutor interface object by Type casting		
        JavascriptExecutor js = (JavascriptExecutor)driver;		
        		
      		
        driver.get("http://moneyboats.com/");			
     
        //Maximize window		
        driver.manage().window().maximize();		
        		
        //Vertical scroll down by 600  pixels		
        js.executeScript("window.scrollBy(0,600)");
        System.out.println("Scroll suceessfully done!");
        driver.quit();
	}

}
