package launchBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDownConcepts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		// Get the URL
		driver.get("https://www.facebook.com/"); // Face Book
		
		//Select drop down 
		Select s1 = new Select(driver.findElement(By.id("day")));
		s1.selectByVisibleText("30");
		
		Select s2 = new Select(driver.findElement(By.id("month")));
		s2.selectByVisibleText("Apr");
		
		Select s3 = new Select(driver.findElement(By.id("year")));
		s3.selectByValue("2016");
		

	}

}
