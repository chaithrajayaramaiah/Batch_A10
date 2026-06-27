package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetRect {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement subscribe = driver.findElement(By.xpath("//input[@value='Subscribe']"));
	Rectangle rect = subscribe.getRect();
	System.out.println("Heigth:"+rect.getHeight());
	System.out.println("Width:"+rect.getWidth());
	System.out.println("X:"+rect.getX());
	System.out.println("Y:"+rect.getY());
}
}
