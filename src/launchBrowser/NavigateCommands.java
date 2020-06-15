package launchBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		// Get the URL
		driver.get("https://freecrm.co.in/");

		// Click on LOgin button
		driver.findElement(By.xpath("//span[@class = 'icon icon-xs mdi-chart-bar']")).click();
		// Enter on username and password
		driver.findElement(By.name("email")).sendKeys("buddy6jar@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).clear();
		System.out.println("Cleared");
		
		driver.quit();
		
//		driver.findElement(By.name("password")).sendKeys("Buddy6jar!");
//	     
//		driver.findElement(By.xpath("//div[@class ='ui fluid large blue submit button']")).click();
//		
//		// Navigate commands
//		
//		driver.navigate().refresh();
//		
//		driver.navigate().back();
//		
//		driver.navigate().refresh();
//		
//		driver.navigate().forward();
//		
//		driver.navigate().refresh();

	}

}
