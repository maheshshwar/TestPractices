package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDrive2 {
	
public static void main(String[] args) throws InterruptedException{
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Pawan Albankar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
			WebDriver driver = new ChromeDriver();
	       driver.get("https://www.facebook.com/r.php");
	        Thread.sleep(3000);
	        
	     String Url = driver.getCurrentUrl();
	     System.out.println(Url);
	     
	     String expUrl = "https://www.facebook.com/r.php";
	        
	        if(Url.equalsIgnoreCase(expUrl)) {
	        System.out.println("Navigated to correct page");
	        }
	        else {
	        	System.out.println("Navegated to wrong page");
	        }
	     
	        
	        
	        
	        
	        
}

}
