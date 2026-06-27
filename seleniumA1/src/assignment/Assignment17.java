package assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment17 {
public static void main(String[] args) throws IOException, InterruptedException {
	FileInputStream fis=new FileInputStream("./Testdata/Freeshersworld.properties");
	Properties prop= new Properties();
	prop.load(fis);
	String url = prop.getProperty("url");
	String name = prop.getProperty("name");
	String email = prop.getProperty("email");
	String mobile = prop.getProperty("mobile");
	String HighQualification = prop.getProperty("ighestQualificationDetails");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(url);
	driver.findElement(By.id("firstname")).sendKeys(name);
	driver.findElement(By.id("email")).sendKeys(email);
	
	driver.findElement(By.id("mobile")).sendKeys(mobile);
	Thread.sleep(3000);
	WebElement dob = driver.findElement(By.id("datepicker"));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(dob));
	dob.sendKeys("17-03-2002");
	
	File f= new File("C:\\Users\\shobh\\OneDrive\\Desktop\\resume.pdf");
	String abs=f.getAbsolutePath();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='file']")).sendKeys(abs);
	driver.findElement(By.xpath("(//input[@unchecked='unchecked'])[2]")).click();
	driver.findElement(By.id("submitRegister")).click();
	TakesScreenshot ts = (TakesScreenshot) driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File prem= new File("./screenshot/image.png");
	FileHandler.copy(temp, prem);
}
}
