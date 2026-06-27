package xpath;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[text()='Twitter']")).click();
	Set<String> allWinIds = driver.getWindowHandles();
	for(String id: allWinIds) {
		driver.switchTo().window(id);
		String url = driver.getCurrentUrl();
		if(url.equals("https://x.com/nopCommerce")){
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[text()='Create account']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='username_or_email']")).sendKeys("chaithra@gmail.com");
		}
			
	}
}
}
