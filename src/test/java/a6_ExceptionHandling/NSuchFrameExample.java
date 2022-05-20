package a6_ExceptionHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NSuchFrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TBHAUSAH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://demo.guru99.com/selenium/deprecated.html");
		try {
			driver.switchTo().frame("packageFram"); //packageFrame 
			WebElement h1= driver.findElement(By.tagName("h1"));	
		} catch(NoSuchFrameException ex) {
			System.out.println("Message : "+ex.toString());
		}
		driver.quit();
	}

}
