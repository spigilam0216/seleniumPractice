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
	
	public void dropDown_by_values (WebElement ele, String str) {
			Select slct = new Select(ele);
			slct.selectByValue(str);
		}
	
	public void enter_text (WebElement ele, String str) {
		
		ele.sendKeys(str);
		
		}

//public void radio_button (WebElement ele, String str) {
//	
//	ele.click();
//	
//}
	
//Fill Vehicle Data
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
		
		String first_name = "John";
		String last_name = "Hauge";
		String date_of_birth = "03/25/1982";
		String gender = "Male";
		String street_address = "246 Pennsylvania Avenue";
		String country = "United States";
		String zipcode = "29379";
		String city = "Edison";
		String occupation = "Employee";
		String hobbies = " Speeding; Skydiving";
		String website = "http://www.allstate.com/";
		
		String start_date = "04/25/2020";
		String insurance_sum = "25000000";
		String merit_rating = "Bonus 5";
		String damage_insurance = "Full Coverage";
		String optional_products = "Euro Protection;Legal Defense Insurance";
		String courtsey_car = "Yes";
		
		String email = "onlinerental@yahoo.com";
		String phone = "4109273223";
		String username = "onlinerental3";
		String password = "onlinerental123";
		String confirm_password = "onlinerental123";
		String comments = "Here is the quote, please review and let me know if you have any questions";
				
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
		
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		//Fill Insurant Data
		WebElement fnm = driver.findElement(By.id("firstname"));
		enter_text(fnm, first_name);
		
		WebElement lnm = driver.findElement(By.id("lastname"));
		enter_text(lnm, last_name);
		
		WebElement dob = driver.findElement(By.id("birthdate"));
		enter_text(dob, date_of_birth);
		
		driver.findElement(By.xpath("//label[text()='" +gender+ "']")).click();
		
		WebElement street = driver.findElement(By.id("streetaddress"));
		enter_text(street, street_address);
		
		WebElement cntry = driver.findElement(By.id("country"));
		normal_dropDown_Values(cntry, country);
		
		
		WebElement zip = driver.findElement(By.id("zipcode"));
		enter_text(zip, zipcode);
		
		WebElement cty = driver.findElement(By.id("city"));
		enter_text(cty, city);
		
		WebElement occu = driver.findElement(By.id("occupation"));
		normal_dropDown_Values(occu, occupation);
	

		String[] hbs = hobbies.split(";");
		for (String str : hbs) {
			   driver.findElement(By.xpath("//label[text()='" + str+ "']")).click();	
			}
		
//		not necessary --WebElement hobb = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/label"));
//		for (int i = 0; i < hbs.length; i++) {
//			driver.findElement(By.xpath("//label[text()='" + hbs[i]+ "']")).click();
//		}
		
		
		WebElement webs = driver.findElement(By.id("website"));
		enter_text(webs, website);
		
		driver.findElement(By.id("nextenterproductdata")).click();
		
		String expected_title_ins = "Fill Product Data";
		String actual_title_ins = driver.getTitle();
		System.out.println("Actual Title Ins:" + actual_title_ins);
		
		Assert.assertEquals(actual_title_ins, expected_title_ins, "Title doesnt match for INS");
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		WebElement stdt = driver.findElement(By.id("startdate"));
		enter_text(stdt, start_date);
		
		WebElement ins = driver.findElement(By.id("insurancesum"));
		dropDown_by_values(ins, insurance_sum);
		
		WebElement mrt = driver.findElement(By.id("meritrating"));
		normal_dropDown_Values(mrt, merit_rating);
		
		WebElement dmg = driver.findElement(By.id("damageinsurance"));
		normal_dropDown_Values(dmg, damage_insurance);
		
		String[] ops = optional_products.split(";");
		for (String str : ops) {
			   driver.findElement(By.xpath("//label[text()='" + str+ "']")).click();	
			}
		
		WebElement car = driver.findElement(By.id("courtesycar"));
		normal_dropDown_Values(car, courtsey_car);
		
		driver.findElement(By.id("nextselectpriceoption")).click();
		
		String expected_title_price = "Choose Price Option";
		String actual_title_price = driver.getTitle();
		System.out.println("Actual Title Price:" + actual_title_price);
		
		Assert.assertEquals(actual_title_price, expected_title_price, "Title doesnt match for PRICE");
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		int no_of_rows = driver.findElements(By.xpath("//table[@id='priceTable']/tbody/tr")).size();
		System.out.println("No of rows:" + no_of_rows);
		int no_of_cols = driver.findElements(By.xpath("//table[@id='priceTable']/tbody/tr[1]/td")).size();
		System.out.println("No of columns:" + no_of_cols);
		String silver_price = driver.findElement(By.xpath("//table[@id='priceTable']/tbody/tr[1]/td[2]")).getText();
		System.out.println("Silver plan price:" + silver_price);
		
		driver.findElement(By.xpath("//table[@id='priceTable']//tfoot//th[2]/label[3]")).click();
		driver.findElement(By.xpath("//button[@id='nextsendquote']")).click();
		
		
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////
		WebElement eml = driver.findElement(By.id("email"));
		enter_text(eml, email);
		
		WebElement phn = driver.findElement(By.id("phone"));
		enter_text(phn, phone);
		
		WebElement uname = driver.findElement(By.id("username"));
		enter_text(uname, username);
		
		WebElement passw = driver.findElement(By.id("password"));
		enter_text(passw, password);
		
		WebElement cpsw = driver.findElement(By.id("confirmpassword"));
		enter_text(cpsw, confirm_password);
		
		WebElement cmnt = driver.findElement(By.id("comments"));
		enter_text(cmnt, comments);
		
		driver.findElement(By.xpath("//button[@id='sendemail']")).click();
		
  }
  

}
