package b3_SeleniumGrid;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;


public class TestClass {
	
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream("C:\\Users\\TBHAUSAH\\eclipse-workspace\\TrainingAssignmentsSelenium\\src\\test\\resources\\info.properties");
		Properties prop= new Properties();
		prop.load(fis);
		String browserName= prop.getProperty("browser");
		
		
		URL url= new URL("http://192.168.1.4:4444/wd/hub");
	  if(browserName.equals("chrome")) {
		  ChromeOptions option1 = new ChromeOptions();
		  driver= new RemoteWebDriver(url, option1);
		  }
	  else if(browserName.equals("Firefox")) {
		  FirefoxOptions option2= new FirefoxOptions();
		  driver = new RemoteWebDriver(url, option2);
	  }
	  driver.manage().window().maximize();
	  driver.get("http://www.google.com");
	  System.out.println("Current url: "+driver.getCurrentUrl());
	  System.out.println("Title of page is "+driver.getTitle());
	  System.out.println("Pass");
	  driver.close();
	}
	   
}
