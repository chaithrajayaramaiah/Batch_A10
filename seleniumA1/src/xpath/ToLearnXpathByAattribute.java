package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByAattribute {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//input[@id='newsletter-email']")).sendKeys("chaithrajayaramaiah@gmai.com");
	driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']")).click();
}
}
