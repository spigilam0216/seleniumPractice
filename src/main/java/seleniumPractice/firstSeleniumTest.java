package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firstSeleniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//start writing code Selenium plus Java
				//System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\chromedriver_win32\\chromedriver.exe");
				WebDriverManager.chromedriver().setup();
				//1 Launch Browser
				WebDriver driver = new ChromeDriver();
				//Navigate to AUT //demo.automationtalks.com
				driver.get("http://demo.automationtalks.com/");
				//Verify Page Title
				String ExpectedPageTitle = "Fill Vehicle Data";
				String ActualPageTitle = driver.getTitle();
				System.out.println(ActualPageTitle);
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
