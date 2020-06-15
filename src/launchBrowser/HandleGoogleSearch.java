package launchBrowser;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleGoogleSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/"); // launch the url
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // delete all the cookies
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// search for India
		driver.findElement(By.name("q")).sendKeys("India");

		// print the suggestion size
		List<WebElement> list = driver
				.findElements(By.xpath("//ul[@role = 'listbox']//li/descendant::div[@class = 'sbl1']"));
		System.out.print("The number suggestions are : " + list.size());

		// print all  of the suggestions and click on any one suggestion
		for (int i = 0; i < list.size(); i++) {
			System.out.println("The search scope is " + list.get(i).getText());
			if(list.get(i).getText().contains("india lockdown")){
				list.get(i).click();
				break;
			}
			
		}

		driver.quit();

	}

}
