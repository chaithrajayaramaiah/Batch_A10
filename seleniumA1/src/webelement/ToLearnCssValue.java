package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnCssValue {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement name = driver.findElement(By.xpath("(//div[@role='none'])[1]"));
	System.out.println(name.getCssValue("color"));
	
}
}
