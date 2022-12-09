package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElement {
	
	
	public static void main(String[] args) throws InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pawan Albankar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
	
       driver.get("https://www.facebook.com/r.php");
		
       driver.manage().window().maximize();
       
       Thread.sleep(2000);
       
       driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mahesh");
       
       driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Gongal");
       
       driver.findElement(By.xpath("(//input[@data-type='text'])[3]")).sendKeys("878392071");
       
       driver.findElement(By.xpath("//input[contains(@data-type,'pass')]")).sendKeys("abscdef");
       
       org.openqa.selenium.WebElement x = driver.findElement(By.xpath("//select[@name='birthday_day']"));
       
       Select ele = new Select (x);
       
     // ele.selectByIndex(18);
      // ele.selectByvalue("18");
      ele.selectByVisibleText("28");
       
       
	}
}
