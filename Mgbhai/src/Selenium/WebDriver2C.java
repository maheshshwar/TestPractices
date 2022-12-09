package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver2C {
	
public static void main(String[] args) throws InterruptedException{
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Pawan Albankar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://majhinaukri.in/");
			Thread.sleep(3000);
			
			String Url = driver.getCurrentUrl()	;
			System.out.println(Url);
			
			String expUrl= "https://majhinaukri.in/";
			if(Url.equalsIgnoreCase(expUrl)) {
				System.out.println("Navigate to correct page");
				
			}
				else {
					System.out.println("Navgate to wrong page");
					
					
				
				
				
				
			}
			
			
			
			
			
			
			
			
	
}
}
