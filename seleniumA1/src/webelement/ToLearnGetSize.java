package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSize {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement search = driver.findElement(By.xpath("//input[@value='Search']"));
	Dimension size = search.getSize();
	System.out.println("Height:"+size.getHeight());
	System.out.println("width"+size.getWidth());
	Point location = search.getLocation();
	System.out.println("X:"+location.getX());
	System.out.println("Y:"+location.getY());
	driver.quit();
}
}
