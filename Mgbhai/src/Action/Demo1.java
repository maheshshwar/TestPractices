package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {
	

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pawan Albankar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver(); // upcasting
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class=_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		Thread.sleep(2000);
		
	WebElement	login=driver.findElement(By.xpath("//a[text()='Login']"));
	
	Actions a = new Actions(driver);
	
	a.moveToElement(login).perform();
		
	WebElement orders = driver.findElement(By.xpath("//div[text()=Orders]"));
	

	a.contextClick(orders).perform();
	

	a.click(orders).perform();
	

		
}
}
