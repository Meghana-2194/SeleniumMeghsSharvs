package launchBrowser;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class JavaScriptExecutorConcepts {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/"); // launch the url
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // delete all the cookies
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.id("email")).sendKeys("test1234@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("test123");

		// what we need to highlight
		WebElement loginButton = driver.findElement(By.id("u_0_b"));
		
		// Call all the method in the main method 
		flash(loginButton , driver);
		
		// call drawBorder method 
		drawBorder(loginButton , driver);
		
		
		// take screenshot
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File( "C:\\Java Selenium\\MySelenium\\SeleniumShravsMeghsPractise\\highlightElement.png"));
		
		// call generate alter method 
		generateAlert(driver ,"Highlighted" );
		
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		// call click element method 
		clickElement(driver,loginButton);
		
		// Call refresh Page 
		refreshPage(driver);
		
		driver.quit();
		
	}

	// flash method
	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 1; i++) {
			changeColor("rgb(0,200,0)", element, driver);
			changeColor(bgcolor, element, driver);
		}
	}

	// Change color method
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// Draw a border
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border = '3px solid red'", element);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	//Generate alert 
	public static void generateAlert(WebDriver driver , String message){
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('"+ message +"')");
	}
	
	// Click on Element using JS
	public static void clickElement(WebDriver driver ,WebElement element ){
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click()", element);
	}
	
	// Refresh using JS 
	public static void refreshPage(WebDriver driver ){
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}
	

}
