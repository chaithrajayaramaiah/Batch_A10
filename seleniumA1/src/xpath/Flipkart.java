package xpath;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[@role='button'] ")).click();
	driver.findElement(By.xpath("//input[@class='nw1UBF v1zwn25']")).sendKeys("Mobile",Keys.ENTER);
	driver.findElement(By.xpath("//div[contains(text(),'Samsung Galaxy')]/../..//div[contains(text(),'Bank Offer')]")).click();
	Thread.sleep(2000);
	Set<String> allWinId = driver.getWindowHandles();
	for(String id: allWinId)
	{
	driver.switchTo().window(id);	
	String url = driver.getCurrentUrl();
	{
		if(url.equals("https://www.flipkart.com/samsung-galaxy-f70e-5g-limelight-green-128-gb/p/itm639bb81aa42d9?pid=MOBHMGHQ9NY7Q4JR&lid=LSTMOBHMGHQ9NY7Q4JRSUK0XY&marketplace=FLIPKART&q=mobiles&store=tyy%2F4io&srno=s_1_1&otracker=AS_Query_TrendingAutoSuggest_1_0_na_na_na&otracker1=AS_Query_TrendingAutoSuggest_1_0_na_na_na&fm=neo%2Fmerchandising&iid=645a479c-743e-497d-8d34-4c4b4a397b9c.MOBHMGHQ9NY7Q4JR.SEARCH&ppt=clp&ppn=mobile-phones-sasa-lele-2026-ab-inline-at-store&ssid=obhq8iv89c0000001779983935385&qH=eb4af0bf07c16429&ov_redirect=true"))
		{
	 String percentage = driver.findElement( By.xpath("(//a[contains(text(),'Mobiles')]/../../../../../../../../../../../../../../../../../..//div[contains(text(),'%')])[1]")).getText();
	System.out.println(percentage);
	//driver.quit();
}}
}
}}