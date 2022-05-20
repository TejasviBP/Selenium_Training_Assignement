package a5_handlingWebTablesFramesDynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TBHAUSAH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://demo.guru99.com/test/table.html");
		WebElement element1= driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[1]"));
		System.out.println("Element 1 : "+element1.getText());
		int numberOfCol;
		for(int numberOfRows=1; numberOfRows<=5; numberOfRows++)
		{
			for(numberOfCol=1; numberOfCol <=3; numberOfCol++)
			{
				WebElement element= driver.findElement(By.xpath("/html/body/table/tbody/tr["+numberOfRows+"]/td["+numberOfCol+"]"));
				System.out.println(element.getText());
			}
		}
	driver.quit();
	}

}
