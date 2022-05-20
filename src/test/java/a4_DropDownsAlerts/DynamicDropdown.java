package a4_DropDownsAlerts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropdown {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option= new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver;
		WebDriverManager.chromedriver().setup();

		driver= new ChromeDriver(option);
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.name("q")).sendKeys("Selenium");
		List<WebElement>list =driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li/div/div/div/span"));
		Thread.sleep(5000);

		System.out.println(list.size());
		int i=1;
		for(WebElement element:list) {
			System.out.println(i+"th element is "+element.getText());
			i++;
			if(element.getText().toLowerCase().equals("Selenium interview questions")) {
				element.click();
				System.out.println(driver.getTitle());
			}
		}
		


	}

}
