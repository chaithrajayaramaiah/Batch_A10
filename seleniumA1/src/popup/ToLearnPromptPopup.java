package popup;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnPromptPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=1");
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement click: checkbox) {
			click.click();
		}
		driver.findElement(By.id("deleteButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Size issue");
		Thread.sleep(2000);   
		driver.switchTo().alert().accept();
	}
}
