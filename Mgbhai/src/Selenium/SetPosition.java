package Selenium;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {
	
public static void main(String[] args) throws InterruptedException{
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Pawan Albankar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
			WebDriver driver = new ChromeDriver(); // upcasting
			
			// driver.navigate().to("https://www.facebook.com/r.php");
			driver.get("https://www.amazon.in/");
			Thread.sleep(2000);
			
			Point p = new Point (100,300);
			driver.manage().window().setPosition(p);
			
			
			driver.quit();
			

			
			
			
			
			
			
}

}
