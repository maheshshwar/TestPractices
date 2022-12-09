package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {
	
	
	public static void main(String[] args) throws InterruptedException{
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Pawan Albankar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
			WebDriver driver = new ChromeDriver();
	       driver.get("https://www.facebook.com/r.php");
	        Thread.sleep(3000);
	        
	       // driver.close() ;// close single tab //
	       //   driver.quit() ; // close whole browser//
	        
	        String title = driver.getTitle();
	        System.out.println(title); // actual title
	        
	        String exptitle = "up for Facebook | Facebook" ;
	        
	        if(title.equalsIgnoreCase(exptitle)) {
	        System.out.println("Navigated to correct page");
	        }
	        else {
	        	System.out.println("Navegated to wrong page");
	        }
	        
	        driver.switchTo().newWindow(WindowType.TAB);
	        driver.get("https://www.facebook.com/r.php");
	        
	        driver.close();
	        driver.quit();
	
	

}

}