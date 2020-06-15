package launchBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButtons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
		// Get the URL
		driver.get("https://www.facebook.com/"); // Face Book
		
		// Select Radio Button
		driver.findElement(By.xpath("//input[@value = '-1']")).click();
		
		Select select = new Select(driver.findElement(By.xpath("//select[@name= 'preferred_pronoun']")));
		select.selectByValue("6");
		
		
		
	
	}

}
