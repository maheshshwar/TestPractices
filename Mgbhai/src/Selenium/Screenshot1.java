package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {
	
	
public static void main(String[] args) throws InterruptedException,   IOException {
		
					
System.setProperty("webdriver.chrome.driver","C:\\Users\\Pawan Albankar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
			
			WebDriver driver = new ChromeDriver(); // upcasting
			
			driver.navigate().to("http://www.flipkart.com");		
			
			Thread.sleep(2000);
			
				
		
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destination = new File ("C:\\Users\\Pawan Albankar\\Desktop\\golu\\Test02.jpg");
			
			FileHandler.copy(src, destination);
			
			
			
			
			
	
	
}
}
