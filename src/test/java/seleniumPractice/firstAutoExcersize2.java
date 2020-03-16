package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firstAutoExcersize2 {
	
	public void normal_dropDown_Values (WebElement ele, String str) {
		
		Select slct = new Select(ele);
		slct.selectByVisibleText(str);
		
	}
	
public void enter_text (WebElement ele, String str) {
		
		ele.sendKeys(str);
		
	}

//public void radio_button (WebElement ele, String str) {
//	
//	ele.click();
//	
//}
	
  @Test
  public void fill_vehicle_data() {
	  	String engine = "1000";
		String cylinder = "300";
		String payload = "600";
		String total_weight = "2000";
		String list_price = "5000";
		String license_plate = "10000";
		String annual_mileage = "36000";
		String dt_manufacture = "03/16/2020";
		String right_hand_drive = "Yes";
		
			  
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtalks.com/index.html");
		driver.manage().window().maximize();
		
		
		WebElement mk = driver.findElement(By.id("make"));
		normal_dropDown_Values(mk, "BMW");
		
		WebElement mdl = driver.findElement(By.id("model"));
		normal_dropDown_Values(mdl, "Motorcycle");
		
		WebElement seats = driver.findElement(By.id("numberofseats"));
		normal_dropDown_Values(seats, "3");
		
		WebElement seatsmo = driver.findElement(By.id("numberofseatsmotorcycle"));
		normal_dropDown_Values(seatsmo, "2");
		
		WebElement fuel = driver.findElement(By.id("fuel"));
		normal_dropDown_Values(fuel, "Petrol");
		
//		WebElement rthand = driver.findElement(By.xpath("//label[text()='Right Hand Drive']"));
//		radio_button(rthand, right_hand_drive);
		
		driver.findElement(By.xpath("//label[text()='" +right_hand_drive+ "']")).click();
		
		
		WebElement cyl = driver.findElement(By.id("cylindercapacity"));
		enter_text(cyl, cylinder);
		
		WebElement eng = driver.findElement(By.id("engineperformance"));
		enter_text(eng, engine);
		
		WebElement pload = driver.findElement(By.id("payload"));
		enter_text(pload, payload);
		
		WebElement weight = driver.findElement(By.id("totalweight"));
		enter_text(weight, total_weight);
		
		WebElement price = driver.findElement(By.id("listprice"));
		enter_text(price, list_price);
		
		WebElement license = driver.findElement(By.id("licenseplatenumber"));
		enter_text(license, license_plate);
		
		WebElement mileage = driver.findElement(By.id("annualmileage"));
		enter_text(mileage, annual_mileage);
		
		WebElement date_manu = driver.findElement(By.id("dateofmanufacture"));
		enter_text(date_manu, dt_manufacture);
		
		
		driver.findElement(By.id("nextenterinsurantdata")).click();
		
		String expected_title = "Fill Insurant Data";
		String actual_title = driver.getTitle();
		System.out.println("Actual Title:" + actual_title);
		
		Assert.assertEquals(actual_title, expected_title, "Title doesnt match");
		
			
  }


}
