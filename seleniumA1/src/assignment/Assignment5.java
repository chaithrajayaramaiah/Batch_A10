package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Set<String> allWinIds = driver.getWindowHandles();
		for(String ids:allWinIds) {
			driver.switchTo().window(ids);
			String url = driver.getCurrentUrl();
		if(url.equals("https://www.facebook.com/nopCommerce")) {
		driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("chaithrajayaramaiah@gmail.com");
		driver.findElement(By.xpath("(//input[@name='pass'])[2]")).sendKeys("Chai@123");

	}

}
}
}