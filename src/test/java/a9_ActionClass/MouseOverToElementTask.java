package a9_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import a2_SeleniumBasicsAndInvokingDifferentBrowsers.A1_UseDifferentDrivers;

public class MouseOverToElementTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= A1_UseDifferentDrivers.launchBrowser();
		driver.get("http://www.myntra.com");
		
		WebElement men= driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/a"));
		Actions act= new Actions(driver);
		act.moveToElement(men).build().perform(); // Here build is otional because here only one action is associated
		Thread.sleep(3000);
		WebElement tshirts= driver.findElement(By.linkText("T-Shirts"));
		tshirts.click();
		
		WebElement checkBox= driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[3]/div[1]/section/div/div[2]/ul/li[1]/label/div"));
		checkBox.click();
		
		WebElement roadster= driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[3]/div[1]/section/div/div[2]/ul/li[1]/label/div"));
		roadster.click();
		
		System.out.println("Execution Sucessful");
		driver.quit();
		
		
		 
	

	}

}
