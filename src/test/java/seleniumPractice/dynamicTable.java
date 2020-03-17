package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamicTable {
	
	 @Test
	  public void search_text() {
		   				  
		    WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("http://demo.automationtalks.com/SE-ESY/www.AutomationTalks.com/test/table-sort-search-demo.html");
			driver.manage().window().maximize();
			
			String actual_name = "S. Frost";
			String salary = null;
			String expected_name = null;
			
			while (actual_name != expected_name)
			{
				
				try {
					expected_name = driver.findElement(By.xpath("//table[@id='example']/tbody//td[contains(text(), 'S. Frost')]")).getText();
					salary = driver.findElement(By.xpath("//table[@id='example']/tbody//td[contains(text(), 'S. Frost')]/following-sibling::td[5]")).getText();
					System.out.println("expected_name :" + expected_name + " Salary: " + salary);
					break;
				} catch (Exception e) {
					driver.findElement(By.xpath("//a[text()='Next']")).click();
					
				}
				
					
			} 
			
	 }
  

}
