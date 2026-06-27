package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToCaptureAllOption {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("file:///C:/Users/shobh/OneDrive/Desktop/multi%20select.html");
	WebElement dropdown = driver.findElement(By.id("countries"));
	Select sel = new Select(dropdown);
	sel.selectByIndex(1);
	sel.selectByIndex(5);
	sel.selectByIndex(6);
	List<WebElement> allOption = sel.getAllSelectedOptions();
	for(WebElement ele: allOption) {
		System.out.println(ele.getText());
	}
}
}
