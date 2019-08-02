
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {
	
/*
 * public static void main(String[] args) {
 */
	
	//Without using WebDriver manager
	/*String projectPath = System.getProperty("user.dir");
	System.out.println(projectPath);
	System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chrome/chromedriver");
	*/
	
	//Using WebDriverManager
	// WebDriverManager.chromedriver().setup();
	// WebDriver driver = new ChromeDriver();
	
	/*
	driver.get("https://www.google.com/");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  // Let the user actually see something!
	
	WebElement searchBox = driver.findElement(By.name("q"));
	searchBox.sendKeys("Harihar Ramakrishnan");
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.close();
	driver.quit();
}
*/
}
