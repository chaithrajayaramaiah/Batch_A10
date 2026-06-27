package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchDataFromPropertyFile {
public static void main(String[] args) throws IOException {
	
	//create file location
	FileInputStream fis =new FileInputStream("./Testdata/commondata.properties");
	//file specific object
	Properties prop= new Properties();
	//load
	prop.load(fis);
	//getproperties
	String url = prop.getProperty("url");
	System.out.println(url);
	String email = prop.getProperty("email");
	System.out.println(email);
	String password = prop.getProperty("password");
	System.out.println(password);
	//testscript
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(url);
	driver.findElement(By.xpath("//a[text()='Log in']")).click();
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(password);
	driver.findElement(By.id("RememberMe")).click();
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
}
}
