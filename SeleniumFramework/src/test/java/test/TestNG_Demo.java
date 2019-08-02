package test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

public class TestNG_Demo {
	static WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	@Test
	public void googleSearch() {
		driver.get("https://www.google.com/");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("Jenkins");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		
		//driver.findElement(By.name("q")).sendKeys("Jenkins");
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
	}
}
