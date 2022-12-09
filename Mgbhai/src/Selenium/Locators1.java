package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {
	
	public static void main(String[] args) throws InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pawan Albankar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
       driver.get("https://www.facebook.com/");
       
       driver.findElement(By.tagName("inpute")).sendKeys("mahesh@123");
       Thread.sleep(2000);
       
       driver.findElement(By.id("email")).sendKeys("maheshwar@123");
       Thread.sleep(2000);
       
       driver.findElement(By.className("inpute tex")).sendKeys("maheshwar@123");
       Thread.sleep(2000);
       
       driver.findElement(By.name("email")).sendKeys("maheshwar@123");
       Thread.sleep(2000);
       
       driver.findElement(By.linkText("Messenger")).click();
       
       driver.findElement(By.partialLinkText("Messes")).click();
       Thread.sleep(2000);
       
      
       
       
       
       
       
       
       
       
       
	}

}
