package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) throws InterruptedException{
		
	
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Pawan Albankar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
			WebDriver driver = new ChromeDriver();
	       driver.get("https://www.facebook.com/");
	       
	       driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9049981571");
	       Thread.sleep(2000);
	       
	       driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rocky@123");
	       Thread.sleep(2000);
	       
	       driver.findElement(By.xpath("//button[@value='1']")).click();
	       
	       
	       
	       
	       
	       
	       
	       
	}

}
