package Popup;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLink {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pawan Albankar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver(); // upcasting
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		System.out.println( links.size());
		
		for(int i=0;i<links.size();i++) {
			
			System.out.println(links.get(i).getText()+":"+links.get(i).getAttribute("href"));
			
			
		}
		
			
		
	
}
}
