package launchBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		// Get the URL
		driver.get("https://www.facebook.com/"); // Face Book
		// Locator Concepts
		// // By ID
		// driver.findElement(By.id("u_0_m")).sendKeys("Buddy6");
		// driver.findElement(By.id("u_0_o")).sendKeys("Jar");
		// driver.findElement(By.id("u_0_r")).sendKeys("9898989890");
		// driver.findElement(By.id("u_0_w")).sendKeys("Buddy6jar!");

		// //By Name
		// driver.findElement(By.name("firstname")).sendKeys("Buddy6");
		// driver.findElement(By.name("lastname")).sendKeys("Jar");
		// driver.findElement(By.name("reg_email__")).sendKeys("9898989890");
		// driver.findElement(By.name("reg_passwd__")).sendKeys("Buddy6jar!");
		// //By ClassName :skipped
		// // By Tag Name : skipped
		// By Link Text
		// driver.findElement(By.linkText("Create a Page")).click();

		// By Partial Link Text : not usefull
		// driver.findElement(By.partialLinkText("Create ")).click();

		// By Css Selector : Tag and ID
		driver.findElement(By.cssSelector("#u_0_m")).sendKeys("Buddy6");
		driver.findElement(By.cssSelector("#u_0_o")).sendKeys("Jar");
		driver.findElement(By.cssSelector("#u_0_r")).sendKeys("9898989890");
		driver.findElement(By.cssSelector("#u_0_w")).sendKeys("Buddy6jar");

		// By Xapth

	}

}
