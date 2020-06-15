package launchBrowser;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlePopUpConcepts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://popuptest.com/goodpopups.html"); // launch the url

		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // delete all the cookies
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

		// a[contains(text() , "Good PopUp #1")]

		driver.findElement(By.xpath("//a[contains(text() , 'Good PopUp #1')]")).click();

		// use window handler API
		Set<String> handler = driver.getWindowHandles();

		// iterator
		Iterator<String> it = handler.iterator();

		// parent
		String parentWindow = it.next();
		System.out.println("The parent window is  " + parentWindow);
		// child
		String childWindow = it.next();
		System.out.println("The child window is  " + childWindow);

		// perform
		// Switch child

		driver.switchTo().window(childWindow);
		
		Thread.sleep(5000);

		String childTitle = driver.getTitle();
		System.out.println("The tilt of the child window is " +childTitle);

		driver.close();
		
		Thread.sleep(5000);

		// Switch back to parent window
		driver.switchTo().window(parentWindow);
		
		Thread.sleep(5000);

		String parentTitle = driver.getTitle();
		System.out.println("The tilt of the Parent window is " +parentTitle);

		driver.close();

	}

}
