  package assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.redbus.in/");
	String url = driver.getCurrentUrl();
	if(url.equals("https://www.redbus.in/")) {
		System.out.println("welcome page is displayed");
	}
	else {
		System.out.println("welcome page is not displayed");
	}
	//String code = driver.getPageSource();
	//System.out.println(code);
	Dimension size = driver.manage().window().getSize();
	System.out.println("height:"+size.getHeight());
	System.out.println("size:"+size.getWidth());
	Point position = driver.manage().window().getPosition();
	System.out.println("X:"+position.getX());
	System.out.println("Y:"+position.getY());
	driver.quit();
}
}
