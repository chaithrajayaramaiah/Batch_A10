package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsDisplayed {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	boolean image = driver.findElement(By.xpath("//img[contains(@alt,'Demo Web Shop')]")).isDisplayed();
	System.out.println(image);
	driver.quit();
}
}
