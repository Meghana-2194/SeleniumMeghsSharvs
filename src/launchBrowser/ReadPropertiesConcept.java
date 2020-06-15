package launchBrowser;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropertiesConcept {

	static WebDriver driver ;
	public static void main(String[] args) throws IOException  {
		
		Properties pr = new Properties();
		FileInputStream  ip = new FileInputStream ("C:\\Java Selenium\\MySelenium\\SeleniumShravsMeghsPractise\\src\\launchBrowser\\config.properties");
        // Load the property 
		pr.load(ip);
		
		//Read property files 
		System.out.println(pr.getProperty("Name"));
		System.out.println(pr.getProperty("Age"));
		String URL = pr.getProperty("URL");
		System.out.println(URL);
		System.out.println(pr.getProperty("Browser"));
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		
	    driver.get(URL);
		
		driver.findElement(By.xpath(pr.getProperty("Firstname_xpath"))).sendKeys(pr.getProperty("Firstname"));
		
		driver.findElement(By.xpath(pr.getProperty("Lastname_xpath"))).sendKeys(pr.getProperty("Lastname"));
	}

}
