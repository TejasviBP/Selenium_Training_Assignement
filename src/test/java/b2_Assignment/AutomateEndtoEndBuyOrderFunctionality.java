package b2_Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import a2_SeleniumBasicsAndInvokingDifferentBrowsers.A1_UseDifferentDrivers;

public class AutomateEndtoEndBuyOrderFunctionality {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= A1_UseDifferentDrivers.launchBrowser();
		// Open link http://automationpractice.com/index.php
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		//2. Login to the web-site.
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email")).sendKeys("rastvh8@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("rastvh8");
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(5000); 

		//3. Move your cursor over Women's link.
		Actions action = new Actions(driver);
		WebElement women = driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]"));
		action.moveToElement(women).perform();
		Thread.sleep(1000);
		
		//4. Click on sub menu 'T-shirts'.
		driver.findElement(By.linkText("T-shirts")).click();
		
		//5. Mouse hover on the second product displayed.
		WebElement product=driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div"));
		action.moveToElement(product).build().perform();

		//6. 'More' button will be displayed, click on 'More' button.
		WebElement more=driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]"));
		more.click();

		//7. Increase quantity to 2.
		driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]")).click();

		//8. Select size 'L'
		WebElement size= driver.findElement(By.name("group_1"));
		Select selectSize=new Select(size);
		selectSize.selectByVisibleText("L");

		//9. Select colour.
		driver.findElement(By.id("color_14")).click();

		//10. Click 'Add to Cart' button.
		driver.findElement(By.name("Submit")).click();

		//11. Click 'Proceed to checkout' button.
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();
		driver.findElement(By.name("processAddress")).click();

		//select checkbox
		driver.findElement(By.id("cgv")).click();
		// Click 'Proceed to checkout' button.
		driver.findElement(By.name("processCarrier")).click();

		//Proceed to Payment
		driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();
		driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();

		//after checkout
		String str= driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p/strong")).getText();
		System.out.println("After sucessful checkout, response we received is "+str);
		driver.quit();
	}

}
