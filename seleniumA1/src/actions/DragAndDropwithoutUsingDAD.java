package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropwithoutUsingDAD {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demo.automationtesting.in/Static.html");
	WebElement source = driver.findElement(By.id("angular"));
	WebElement target = driver.findElement(By.id("droparea"));
	Actions act= new Actions(driver);
	act.clickAndHold(source).moveToElement(target).release().perform();
	
}
}
