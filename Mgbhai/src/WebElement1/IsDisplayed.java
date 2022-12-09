package WebElement1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class IsDisplayed {
	
public static void main(String[] args) throws InterruptedException{
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Pawan Albankar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
			WebDriver driver = new ChromeDriver(); // upcasting
			
			driver.navigate().to("https://www.facebook.com/r.php");
			
    	    WebElement display = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
			
			 boolean result = display.isDisplayed();
			 
			 System.out.println("result");
			 
			 if(result==true) {
				 System.out.println("element is display");
			 }
			 else {
				 System.out.println("element is not display");
			 }
			
	
	
	
	
	
	
	
	
	
}
}
