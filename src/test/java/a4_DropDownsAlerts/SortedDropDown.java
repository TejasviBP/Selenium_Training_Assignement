package a4_DropDownsAlerts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import a2_SeleniumBasicsAndInvokingDifferentBrowsers.A1_UseDifferentDrivers;class SortedDropDown {
	//check dropdown sorted or not
	public static void main(String[] args) {

		WebDriver driver= A1_UseDifferentDrivers.launchBrowser();
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		WebElement options=driver.findElement(By.name("category_id"));
		Select element= new Select(options);
		List<WebElement> list = element.getOptions();

		//create two diiferent lists
		ArrayList originalList= new ArrayList();
		ArrayList tempList= new ArrayList();
		
		for(WebElement newList:list) {
			originalList.add(newList.getText());
			tempList.add(newList.getText());
		}
		
		System.out.println("Original List: "+originalList);
		Collections.sort(tempList);
		System.out.println("Sorted List: "+tempList);
		if(originalList.equals(tempList)) {
			System.out.println("DropDown is in sorted order");
			
		}else{
			System.out.println("Dropdown is not in sorted order");
			System.out.println("Sorted list is : "+tempList);
		}
		driver.quit();
	}

}
