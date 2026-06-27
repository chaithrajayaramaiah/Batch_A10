package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment11 {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.instagram.com/");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("chaithrajayaramaiah");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Chai@123");
	boolean text = driver.findElement(By.xpath("(//div[@role='none'])[1]")).isEnabled();
	System.out.println(text);
	driver.quit(); 
}
}
