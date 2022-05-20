package a5_handlingWebTablesFramesDynamicElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTables2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\TBHAUSAH\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://demo.guru99.com/test/table.html");
		WebElement htmltable=driver.findElement(By.xpath("/html/body/table/tbody"));
		List<WebElement> rows=htmltable.findElements(By.tagName("tr"));
		 
		for(int rnum=0;rnum<rows.size();rnum++)
		{
		List<WebElement> columns=rows.get(rnum).findElements(By.tagName("td"));
		System.out.println("Number of columns:"+columns.size());
		 
		for(int cnum=0;cnum<columns.size();cnum++)
		{
		System.out.println(columns.get(cnum).getText());
		}
		}
	}

}
