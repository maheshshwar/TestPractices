package Action;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollupDown {


public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pawan Albankar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver(); // upcasting
		driver.manage().window().maximize();
		
		driver.get("https://www.album.alexflueras.ro/index.php");
		
		Thread.sleep(5000);
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
							
		js.executeScript("window.scrollby(0,2000)");  // scroll down pixel
		 Thread.sleep(5000);
		
		js.executeScript("window.scrollby(0,-1000)");  // scroll up
		Thread.sleep(5000);
				
		js.executeScript("window.scrollby(1000,0)");  // scroll right
		Thread.sleep(5000);
				
		js.executeScript("window,scrollby(-2000,0)");  // scroll left
		Thread.sleep(5000);
		
		
		
	

}
}