package popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnChildWindowPopUp {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.shoppersstack.com/products_page/51");
	driver.findElement(By.id("compare")).click();
	Thread.sleep(2000);
	Set<String> allwinids = driver.getWindowHandles();
	for(String id:allwinids) {
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.flipkart.com/")) {
			driver.close(); 
		}else if(url.equals("https://www.amazon .in/")) {
			driver.close();
		}else if(url.equals("https://www.ebay.com/")) {
			driver.close();
		}
	}
	
	
}
}
