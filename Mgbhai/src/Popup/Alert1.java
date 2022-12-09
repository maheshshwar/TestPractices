package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert1 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pawan Albankar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver(); // upcasting
		
		driver.get("http://www.cookbook.seleniumacademy.com/Alerts.html");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
			Alert alt = driver.switchTo().alert();
		
		alt.sendKeys("maheshwar");
		
		alt.dismiss();
		
		
		

}
}
