package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnExplicitWait {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.shoppersstack.com/products_page/51");
	WebElement checkTextfield = driver.findElement(By.id("Check Delivery"));
	checkTextfield.sendKeys("123456");
	WebElement button = driver.findElement(By.xpath("//button[text()='Check']"));
	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(button));
	button.click();
}
}
