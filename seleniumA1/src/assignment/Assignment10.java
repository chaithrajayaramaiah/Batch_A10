package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment10 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement radio = driver.findElement(By.xpath("//label[text()='Excellent']/..//input[@id='pollanswers-1']"));
	radio.click();
	boolean text = radio.isSelected();
	System.out.println(text  );
	
}
}
