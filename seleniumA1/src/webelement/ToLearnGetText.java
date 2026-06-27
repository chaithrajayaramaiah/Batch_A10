package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetText {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@role='none'])[1]")).click();
	Thread.sleep(2000);
	String text = driver.findElement(By.xpath("//span[contains(text(),'login information')]")).getText();
	System.out.println(text);
}
}
