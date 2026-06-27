package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClear {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/");
	WebElement webEle1 = driver.findElement(By.xpath("//input[@id='username']"));
	webEle1.clear();
	webEle1.sendKeys("Chaithra");
	WebElement webEle2 = driver.findElement(By.xpath("//input[@id='password']"));
	webEle2.clear();
	webEle2.sendKeys("Chai@123");
}
}
