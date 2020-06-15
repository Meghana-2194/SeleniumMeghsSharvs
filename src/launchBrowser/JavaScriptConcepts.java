package launchBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptConcepts {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/"); // launch the url
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // delete all the cookies
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// call Title method
		String title1 = titleByJS(driver);
		System.out.println("The title is : " + title1);

		// call inner text method
		// System.out.println("The inner Text is : " +getInnerText(driver));

		// call scroll down method
		// scrollDown(driver);

		// Scroll into view
		WebElement element = driver.findElement(By.xpath("//a[contains(text() , 'Services')]"));
		scrollIntoView(driver, element);
		
		
		String innerText = driver.findElement(By.xpath("//a[contains(text() , 'Services')]")).getText();
		System.out.println("The inner text is : " +innerText);
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[contains(text() , 'Services')]")).click();

		driver.quit();

	}

	// Get Title by JS
	public static String titleByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title ;").toString();
		return title;
	}

	// get the inner text sing JS
	public static String getInnerText(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String innerText = js.executeScript("return document.documentElement.innerText ;").toString();                        
		return innerText;
	}

	// Scroll down
	public static void scrollDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

	// scroll into view //a[contains(text() , "Services")]
	public static void scrollIntoView(WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true); ", element);
	}

}
