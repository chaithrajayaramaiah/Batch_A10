package WebdriverMethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetWindowIds {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/products_page/51");
	Thread.sleep(30000);
	driver.findElement(By.id("compare")).click();
	Set<String> winids = driver.getWindowHandles();
	for(String id:winids) {
		System.out.println(id);
		driver.quit();
	}
}
}
