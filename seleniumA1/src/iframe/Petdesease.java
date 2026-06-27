package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Petdesease {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://petdiseasealerts.org/");
	JavascriptExecutor js= (JavascriptExecutor)driver;
	WebElement map = driver.findElement(By.xpath("//a[text()='Go to maps']"));
	js.executeScript("window.scrollIntoView", map);
	map.click();
	driver.switchTo().frame(1);
	Thread.sleep(3000);
	driver.findElement(By.name("Montana")).click();
}

}
