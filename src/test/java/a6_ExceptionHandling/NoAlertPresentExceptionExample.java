package a6_ExceptionHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import a2_SeleniumBasicsAndInvokingDifferentBrowsers.A1_UseDifferentDrivers;

public class NoAlertPresentExceptionExample {
public static void main(String[] args) {
	//WebDriverException
	WebDriver driver= A1_UseDifferentDrivers.launchBrowser();
    driver.get("http://www.flipkart.com/");
    try {
    	  Thread.sleep(3000);
   	   Alert alert=driver.switchTo().alert();
   	   alert.sendKeys("tejasvi");
}catch(NoAlertPresentException e1) {
	System.out.println("Exception1 : "+e1.toString());
	
}catch(InterruptedException e2) {
	System.out.println("Exception2 : "+e2.toString());
}
  
}
}
