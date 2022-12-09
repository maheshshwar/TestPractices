package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver3B {
	
public static void main(String[] args) throws InterruptedException{
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Pawan Albankar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
			WebDriver driver = new ChromeDriver(); // upcasting
			
			driver.navigate().to("https://www.meesho.com/login\r\n");
			Thread.sleep(3000);
			
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			driver.manage().window().minimize();
			Thread.sleep(3000);
			
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
	
	
	
}
}
