package a2_SeleniumBasicsAndInvokingDifferentBrowsers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class A1_UseDifferentDrivers {

	static WebDriver driver;

	public static WebDriver launchBrowser(){
		try {
			FileInputStream fis= new FileInputStream("C:\\Users\\TBHAUSAH\\eclipse-workspace\\TrainingAssignmentsSelenium\\src\\test\\resources\\info.properties");
			Properties prop= new Properties();
			prop.load(fis);
			String browserName= prop.getProperty("browser");
			String url1= prop.getProperty("url");

			if(browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\TBHAUSAH\\eclipse-workspace\\TrainingAssignmentsSelenium\\drivers\\chromedriver.exe");
				driver= new ChromeDriver();
				driver.manage().window().maximize();

			}
			else  if(browserName.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\TBHAUSAH\\eclipse-workspace\\TrainingAssignmentsSelenium\\drivers\\geckodriver.exe");
				driver= new FirefoxDriver();
				driver.manage().window().maximize();

			}

			else  if(browserName.equals("edge")) {
				System.setProperty("webdriver.edge.driver",
						"C:\\Users\\TBHAUSAH\\eclipse-workspace\\TrainingAssignmentsSelenium\\drivers\\msedgedriver.exe");
				driver = new EdgeDriver();
				driver.manage().window().maximize();

			} }catch(Exception e) {
				e.printStackTrace();
			}
		return driver;
	}

}


