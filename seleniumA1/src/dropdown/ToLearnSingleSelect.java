package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSingleSelect {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("file:///C:/Users/shobh/OneDrive/Desktop/COUNTRIES.html");
	WebElement dropdown1 = driver.findElement(By.id("countries"));
	Select sel =new Select(dropdown1);
	sel.selectByIndex(1);
	Thread.sleep(2000);
	driver.quit();
}
}
