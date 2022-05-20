package b1_Wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import a2_SeleniumBasicsAndInvokingDifferentBrowsers.A1_UseDifferentDrivers;

public class UseOfImplicitwait {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=  A1_UseDifferentDrivers.launchBrowser();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		WebElement fileUpload = driver.findElement(By.id("imagesrc"));
		fileUpload.sendKeys("C:\\Users\\TBHAUSAH\\OneDrive - Capgemini\\Pictures\\sm22.PNG");
	
	    
		driver.quit();
		
	
	    
	  
	
	
	}

}
