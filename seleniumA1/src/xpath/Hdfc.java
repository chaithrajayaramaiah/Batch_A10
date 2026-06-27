package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://homeloans.hdfc.bank.in/");
	driver.findElement(By.xpath("//a[text()='Login']")).click();
	driver.findElement(By.xpath("//a[text()='Login To NetBanking']")).click(); 
}
}
