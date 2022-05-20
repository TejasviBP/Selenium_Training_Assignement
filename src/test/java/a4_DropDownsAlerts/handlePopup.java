package a4_DropDownsAlerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlePopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to disable pop up use ChromeOptions class
				ChromeOptions option= new ChromeOptions();
				option.addArguments("--disable-notifications");
				WebDriver driver;
				WebDriverManager.chromedriver().setup();
				
				driver= new ChromeDriver(option);
				
				driver.get("https://redbus.in");

	}

}
