package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByContains {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
//driver.get("https://www.flipkart.com/");
	//Thread.sleep(2000);
//driver.findElement(By.xpath("//span[@role='button']")).click();
	//driver.findElement(By.xpath("(//input[contains(@title,'Search ')])[1]")).sendKeys("shoes");
	driver.get("https://demowebshop.tricentis.com/");
	  
	driver.findElement(By.xpath("//div[contains(text(),' Copyright © 2026 ')]")).getText();

}
}
