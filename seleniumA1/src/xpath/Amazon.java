package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]")).sendKeys("I phone 17 pro",Keys.ENTER);
	List<WebElement> allName = driver.findElements(By.xpath("//span[contains(text(),'iPhone')]"));
	for(WebElement name: allName) {
		String names = name.getText();
		System.out.println(names);
	}
	List<WebElement> price = driver.findElements(By.xpath("//span[contains(text(),'iPhone Air')]/../../../..//span[contains(text(),'₹')]"));
	for(WebElement allPrices: price) {
		String prices = allPrices.getText();
		System.out.println(prices);
	}
}
}
