package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firstAutoExcersize {
  @Test
  public void f() {
	    String gender = "Male";
		String company_name = "iPivot";
		String email = "onlinerental3@yahoo.com";
		String username = "onlinerental3";
		String expected_title = "Your registration completed";
			  
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://services.smartbear.com/samples/TestComplete14/smartstore/");
		driver.manage().window().maximize();
				
		driver.findElement(By.id("menubar-my-account")).click();
		
		driver.findElement(By.xpath("//div[@class='register-block']/div[@class='row']/div/a")).click();
		
		driver.findElement(By.xpath("//label[text()='" + gender+ "']")).click();
		
		
		driver.findElement(By.id("FirstName")).sendKeys("John");
		
		driver.findElement(By.id("LastName")).sendKeys("Hauge");
				
		WebElement day = driver.findElement(By.name("DateOfBirthDay"));
		Select slct = new Select(day);
		slct.selectByVisibleText("13");
		
		WebElement dobmo = driver.findElement(By.name("DateOfBirthMonth"));
		Select slct2 = new Select(dobmo);
		slct2.selectByIndex(8);
		
		WebElement dobyr = driver.findElement(By.name("DateOfBirthYear"));
		Select slct3 = new Select(dobyr);
		slct3.selectByValue("1989");
		
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Username")).sendKeys(username);
		
		driver.findElement(By.id("Password")).sendKeys("onlinerental123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("onlinerental123");
		
		driver.findElement(By.id("Company")).sendKeys(company_name);
		driver.findElement(By.id("Newsletter")).click();
		driver.findElement(By.name("register-button")).click();
		
		String actalTitle = driver.findElement(By.xpath("//a[text()='Continue']/parent::div/parent::div/p")).getText();
		Assert.assertEquals(actalTitle, expected_title, "Title is not matching");
		
		driver.findElement(By.id("Continue")).click();
		
		driver.close();
		
		
  }
}
