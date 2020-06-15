package launchBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicWebTableConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[3]/td[2]
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[3]/td[3]
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://freecrm.co.in/"); // launch the url
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // delete all the cookies
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[@class ='icon icon-xs mdi-chart-bar']")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.name("email")).sendKeys("buddy6jar@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Buddy6jar!");
		
		driver.findElement(By.xpath("//div[@class = 'ui fluid large blue submit button']")).click();
		Thread.sleep(4000);
		
		// Click on contacts 
		 driver.findElement(By.xpath("//span[contains(text(), 'Contacts')]")).click();
		 
		 // Dynamic webtable 
		//td[contains(text() , 'Buddy6')]/parent::td//preceding-sibling::td//input[@name ='id']
		 
		 Thread.sleep(4000);
		 
		 ////a[contains(text(),'test1234')]/parent::td//preceding-sibling::td//input[@name='id']
		//td[contains(text() , 'Buddy6')]/parent::td//preceding-sibling::td//input[@name ='id']
		 //
		 driver.findElement(By.xpath("a[contains(text(),'test1234')]/parent::td//preceding-sibling::td//input[@name='id']")).click();
		
		 Thread.sleep(4000);
		driver.quit();
		

	}

}
