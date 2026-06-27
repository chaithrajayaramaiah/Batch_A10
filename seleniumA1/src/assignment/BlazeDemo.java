package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlazeDemo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://blazedemo.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
	String price = driver.findElement(By.xpath("//td[text()='Aer Lingus']/following-sibling::td[3]")).getText();
	System.out.println("lowest price:"+price);
	driver.findElement(By.xpath("//td[text()='Aer Lingus']/preceding-sibling::td[2]")).click();
	Set<String> allWinId = driver.getWindowHandles();
	for(String id: allWinId)
	{
	driver.switchTo().window(id);	
	String url = driver.getCurrentUrl();
	
		if(url.equals("https://blazedemo.com/purchase.php"))
		{
	driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("chaithra");
	driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Lakkenahalli(v),benglore north, benglore urban -562130");
	driver.findElement(By.xpath("//input[@id='city']")).sendKeys("banglore");
	driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Karnataka");
	driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("562130");
	Actions actions=new Actions(driver);
	actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	driver.findElement(By.xpath("//input[@id='cardType']")).sendKeys("visa",Keys.ENTER);
	driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("945377282652");
	driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("11");
	driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2017");
	driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("CHAITHRA L J");
	driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
	driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
}
}
	}
}