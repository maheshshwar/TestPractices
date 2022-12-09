package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pawan Albankar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver(); // upcasting
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Thread.sleep(1000);
		
		WebElement a =driver.findElement(By.xpath("//a[@class='button button-orange']"));
		
		WebElement b = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		Actions c = new Actions(driver);
		
		//c.moveToElement(a).clickAndHold().moveToElement(b).release().build().perform();
		
		c.dragAndDrop(a,b).perform();
		
		
		
		

}
}
