package pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TestScript2 {
public static void main(String[] args) throws IOException {
	FileInputStream fis= new FileInputStream("./TestData/Commondata.properties");
	Properties prop = new Properties();
	prop.load(fis);
	String url = prop.getProperty("url");
	String firstname = prop.getProperty("FirstName");
	String lastname = prop.getProperty("LastName");
	String email = prop.getProperty("email");
	String password = prop.getProperty("password");
	String confirmpassword = prop.getProperty("confirmpassword");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WelcomePage wp =new WelcomePage(driver);
	driver.get(url);
	wp.getRegLink().click();
	RegisterPage rp=new RegisterPage(driver);
	rp.getGender().click();
	rp.getFirstnametf().sendKeys(firstname);
	rp.getLastnametf().sendKeys(lastname);
	rp.getEmailtf().sendKeys(email);
	rp.getPasswordtf().sendKeys(password);
	rp.getConfirmpasswordtf().sendKeys(confirmpassword);
	rp.getRegisterbtn().click();
	TakesScreenshot ts=(TakesScreenshot)driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File prem=new File("./screenshot/image3.png");
	FileHandler.copy(temp, prem);
}
}
