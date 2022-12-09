package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver3C {
	
public static void main(String[] args) throws InterruptedException{
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Pawan Albankar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
			WebDriver driver = new ChromeDriver(); // upcasting
			
			driver.navigate().to("https://www.croma.com/?utm_source=veve&utm_medium=affiliate&utm_campaign=64385d5ccd0b22e3b5e646a8f39a13cc&utm_term=MSN");
					
			Thread.sleep(1000);
			
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			driver.manage().window().minimize();
			Thread.sleep(1000);
			
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
