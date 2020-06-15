package launchBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		
		// launching the chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Maximize the Browser Window
		driver.manage().window().maximize();
		
		//Delete all cookies 
		driver.manage().deleteAllCookies();
		
		// Implicitly wait 
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
		 // Get the url 
		driver.get("https://www.google.com/");
		
		System.out.println("Success");
		
		// get the title 
		String title = driver.getTitle();
		System.out.println("The title of the Page is : "    +title );
		
		// verify the title 
		if (title.equals("Google")){
			System.out.println("Title is true" );
		}else{
			System.out.println("Title is false");
		}
		
		// Page Source
		String pageSource =  driver.getPageSource();
		System.out.println("The page Source is :  "  +pageSource);
		
		// Close the Browser 
		driver.quit();
	}

}
