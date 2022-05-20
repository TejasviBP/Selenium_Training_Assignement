package a4_DropDownsAlerts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import a2_SeleniumBasicsAndInvokingDifferentBrowsers.A1_UseDifferentDrivers;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBootstrapDropdown {
//Bootstrap dropdown is the one who is define in <a> tag not in <select> tag
	public static void main(String[] args) {
		WebDriver driver;
		//to disable pop up use ChromeOptions class
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver(option);
		driver.get("https://www.hdfcbank.com/");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		System.out.println("Total number of elements:  "+list.size());	
		for(WebElement e:list) {
			if(e.getText().equals("Accounts")) {
				e.click();
				break;
			}
			}
	//For Second dropdown
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[12]/div[1]/div/div/div[2]/div[1]/div[3]/div/div/div/div/div/div[3]/div")).click();
		List<WebElement> list2=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		System.out.println("Total number of elements:  "+list2.size());	
		for(WebElement e:list2) {
			
			if(e.getText().equals("Savings Accounts")) {
				e.click();
				break;
			}
			}
		driver.quit();
	
	}

}
