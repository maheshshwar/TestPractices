package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class ScreenshotA {
	
public static void main(String[] args) throws InterruptedException,   IOException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Pawan Albankar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
			WebDriver driver = new ChromeDriver(); // upcasting
			
			driver.navigate().to("https://www.amazon.in/");
			
			Thread.sleep(2000);
			
			for(int i=10;i>=1;i--) {
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  // type casting
			
		
			File destination = new File ("C:\\Users\\Pawan Albankar\\Desktop\\golu\\Test"+i+".jpeg");
			
			FileHandler.copy(src, destination);

			
	}			
}
}
