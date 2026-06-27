package assignment;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment7 {
 public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.abhibus.com/");
	Thread.sleep(2000);
	WebElement fromcity = driver.findElement(By.xpath("//input[contains(@placeholder,'Leaving From')]"));
	fromcity.sendKeys("Hyderabad");
	Thread.sleep(2000);
	Actions actions=new Actions(driver);
	actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	//Thread.sleep(2000);
	WebElement toCity = driver.findElement(By.xpath("//input[contains(@placeholder,'Going To')]"));
	toCity.sendKeys("Bangalore");
	actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
	Thread.sleep(2000);
	List<WebElement> busName = driver.findElements(By.xpath("//h5"));
	
	for(WebElement bus:busName) {
		String name = bus.getText();
		System.out.println("busname:"+name);
	}
	List<WebElement> departureTime = driver.findElements(By.xpath("//span[contains(@class,'departure-time ')]"));
	for(WebElement departure:departureTime) {
		String dTime = departure.getText();
		System.out.println("departure time:"+dTime);
	}
	List<WebElement> arrivalTime = driver.findElements(By.xpath("//span[contains(@class,'departure-time ')]"));
	for(WebElement arrival:arrivalTime) {
		String aTime = arrival.getText();
		System.out.println("arrival time:"+aTime);
	}
	List<WebElement> prices = driver.findElements(By.xpath("//*[contains(@class,'fare')]"));
for(WebElement price:prices) {
	System.out.println("price:"+price.getText());
}
	driver.quit();
}
}
