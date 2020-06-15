package launchBrowser;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		// Get the URL
		driver.get("https://www.facebook.com/"); // Face Book
		
		List<WebElement> listElements =driver.findElements(By.tagName("a"));
		System.out.println("The size of the Links are : "  +listElements.size());
		
		for (int i = 0 ; i < listElements.size() ; i++){
			String list = listElements.get(i).getText();
			System.out.println("The lists are : " +list);
		}

	}

}
