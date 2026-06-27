package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisableCheckbox {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
	 driver.findElement(By.xpath("//section[text()='Button']")).click();
	 driver.findElement(By.xpath("//a[text()='Disabled']")).click();
	 JavascriptExecutor js= (JavascriptExecutor)driver;
	 WebElement submit = driver.findElement(By.id("submit"));
	 js.executeScript("arguments[0].removeAttribute('disabled')",submit );
	 submit.click();
	 driver.findElement(By.id("submitButton")).click();
}
}
