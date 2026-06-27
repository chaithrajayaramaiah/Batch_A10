package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assigment14 {
	public static void main(String[] args) {
	WebDriver  driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
	driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
	WebElement product = driver.findElement(By.id("select-multiple-native"));
	
	Select sel = new Select(product);
	sel.selectByIndex(6);
	sel.selectByIndex(7);
	sel.selectByIndex(5);
	 List<WebElement> ele = sel.getAllSelectedOptions();
	for(WebElement element : ele) {
	System.out.println(element.getText());
	}
}
}
