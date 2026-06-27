package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment16 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	Thread.sleep(2000);
	WebElement source = driver.findElement(By.xpath("(//li[contains(@class,'draggable ui-draggable-handle')])[1]"));
	WebElement target = driver.findElement(By.id("trash"));
	Actions act = new Actions(driver);
	act.dragAndDrop(source, target).perform();
}
}
