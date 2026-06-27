package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnMutliSelect {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("file:///C:/Users/shobh/OneDrive/Desktop/multi%20select.html");
	WebElement dropdown = driver.findElement(By.id("countries"));
	Select sel= new Select(dropdown);
	sel.selectByIndex(1);
	sel.selectByIndex(4);
	sel.selectByIndex(6);
	Thread.sleep(2000);
	sel.deselectByIndex(4);
	Thread.sleep(2000);
}
}
