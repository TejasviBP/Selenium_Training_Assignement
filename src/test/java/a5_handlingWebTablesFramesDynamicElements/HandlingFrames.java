package a5_handlingWebTablesFramesDynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TBHAUSAH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://demo.guru99.com/selenium/deprecated.html");
		driver.switchTo().frame("packageFrame");
		WebElement h1= driver.findElement(By.tagName("h1"));
		
		System.out.println(h1.getText());
		driver.findElement(By.xpath("/html/body/div[3]/ul/li[14]/a")).click();
		
		driver.switchTo().frame("classFrame");
		WebElement tag2= driver.findElement(By.tagName("h1"));
	}
}
