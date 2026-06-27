package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.id("gender-female")).click();
	driver.findElement(By.id("FirstName")).sendKeys("Chaithra");
	driver.findElement(By.id("LastName")).sendKeys("L J");
	driver.findElement(By.id("Email")).sendKeys("chaithrajayaramaiah@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Chai@123");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("Chai@123");
}
}
