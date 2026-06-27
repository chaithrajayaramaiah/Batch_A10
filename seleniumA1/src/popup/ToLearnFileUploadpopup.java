package popup;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnFileUploadpopup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui/formValidation?sublist=0");
	File f= new File("C:\\Users\\shobh\\OneDrive\\Desktop\\resume.pdf - Shortcut.lnk");
	String abs=f.getAbsolutePath();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='file']")).sendKeys(abs);
}
}