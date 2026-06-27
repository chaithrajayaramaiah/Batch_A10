package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetAttribute {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	for(WebElement link:links) {
		String name = link.getText();
		System.out.println(name);
		System.out.println(link.getAttribute("href"));
	}
	
	driver.quit();
}
}
