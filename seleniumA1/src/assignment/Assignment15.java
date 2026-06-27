package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment15 {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demo.automationtesting.in/Frames.html");
	driver.switchTo().frame("SingleFrame");
	WebElement textfield1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	textfield1.sendKeys("selenium");
	File temp = textfield1.getScreenshotAs(OutputType.FILE);
	File prem=new File("./screenshot/image1.png");
	FileHandler.copy(temp, prem);
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
	WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	driver.switchTo().frame(frame1);
	WebElement frame2 = driver.findElement(By.xpath("//h5[text()='iFrame Demo']"));
	driver.switchTo().frame(frame2);
	WebElement textfield2 = driver.findElement(By.xpath("//input[@type='text']"));
	textfield2.sendKeys("automation");
	
}
}
