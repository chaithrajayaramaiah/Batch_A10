package takesScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToLearnTakeAScreenshotOfWebElement {
public static void main(String[] args) throws IOException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement text = driver.findElement(By.xpath("//img[contains(@alt,' Demo Web Shop')]"));
	File temp = text.getScreenshotAs(OutputType.FILE);
	File prem=new File("./screenshot/image1.png");
	FileHandler.copy(temp, prem);
}
}
