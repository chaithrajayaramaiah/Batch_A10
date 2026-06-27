package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToLearnSoftAssert {
	@Test
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		SoftAssert soft= new SoftAssert();
		
		soft.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/login","Login Page is not displayed");
		soft.assertAll();
		Reporter.log("login page id displayed",true);
		driver.findElement(By.id("Email")).sendKeys("chaithrajayaramaiah@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Chai@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		soft.assertEquals(driver.getTitle(), "Demo Web Shop", "Home Page is not displayed");
		soft.assertAll();
		Reporter.log("Home page is displayed",true);
		
}
}
