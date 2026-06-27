package assignment;


import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment13 {
public static void main(String[] args) {
	WebDriver  driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
	WebElement country = driver.findElement(By.id("select3"));
	
	Select sel = new Select(country);
	sel.selectByIndex(6);
	WebElement select1 = sel.getFirstSelectedOption();
	System.out.println(select1);
	
}
}
  