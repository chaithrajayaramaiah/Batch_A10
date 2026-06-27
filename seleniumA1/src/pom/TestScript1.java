package pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript1 {
	public static void main(String[] args) throws IOException {
		
	
	FileInputStream fis =new FileInputStream("./Testdata/Commondata.properties");
	Properties prop= new Properties();
	prop.load(fis);
	String url = prop.getProperty("url");
	String email = prop.getProperty("email");
	String password = prop.getProperty("password");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(url);
	WelcomePage wp =new WelcomePage(driver);
	wp.getLoginlink().click();
	LoginPage lp= new LoginPage(driver);
	lp.getEmailtf().sendKeys(email);
	lp.getPasswordtf().sendKeys(password);
	lp.getLoginbtn().click();
}
}