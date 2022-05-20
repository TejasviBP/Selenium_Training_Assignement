package a2_SeleniumBasicsAndInvokingDifferentBrowsers;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A2_LaunchDriverUsingWebDriverManager {
	static WebDriver driver;
	public static void main(String[] args) {
		try {
			FileInputStream fis= new FileInputStream("C:\\Users\\TBHAUSAH\\eclipse-workspace\\TrainingAssignmentsSelenium\\src\\test\\resources\\info.properties");
			Properties prop= new Properties();
			prop.load(fis);
			String browserName= prop.getProperty("browser");
			String url1= prop.getProperty("url");

			if(browserName.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.get(url1);

			} else if(browserName.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver= new FirefoxDriver();
				driver.get(url1);
			}
			else if(browserName.equals("edge")) {
				WebDriverManager.edgedriver().setup();
				driver= new EdgeDriver();
				driver.get(url1);
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
