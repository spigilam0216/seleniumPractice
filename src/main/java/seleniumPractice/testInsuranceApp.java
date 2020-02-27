package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testInsuranceApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//start writing code Selenium plus Java
				//System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\chromedriver_win32\\chromedriver.exe");
				WebDriverManager.chromedriver().setup();
				//1 Launch Browser
				WebDriver driver = new ChromeDriver();
				//Navigate to AUT //demo.automationtalks.com
				driver.get("http://qdpm.net/demo/v9/index.php");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
				//thread sleep
				Thread.sleep(4000);
				driver.navigate().refresh();
				Thread.sleep(4000);
				
				//find element
				//driver.findElement(By.id("nav_truck")).click();
				//driver.navigate().back();
				//Thread.sleep(4000);
				
				//driver.navigate().forward();
				
				
				//Navigate to AUT //demo.automationtalks.com
				driver.get("http://qdpm.net/demo/v9/index.php");
				//driver.wait(4000);
				System.out.println ("Current URL:" + driver.getCurrentUrl());
				//Verify Page Title
				String ExpectedPageTitle = "qdPM } Login";
				String ActualPageTitle = driver.getTitle();
				System.out.println("Page Title: "+ ActualPageTitle);
				
				if (ExpectedPageTitle.equalsIgnoreCase(ActualPageTitle))
				{
					System.out.println("Test is passed");
				} else {
					System.out.println("Test is Failed");
				}
				//Close Browser
				driver.close();

	}

}
