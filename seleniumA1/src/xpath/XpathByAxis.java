package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxis {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/shobh/OneDrive/Desktop/movies.html");
	String movieCollection1 = driver.findElement(By.xpath("//td[text()='DHURANDHAR']/following-sibling::td[2]")).getText();
	System.out.println("dhurandhar movie collection:"+movieCollection1);
	String movieCollection2 = driver.findElement(By.xpath("//td[text()='TOXIC']/following-sibling::td[2]")).getText();
	System.out.println("Toxic movie collection:"+movieCollection2);
	String movieCollection3 = driver.findElement(By.xpath("//td[text()='YOUTH']/following-sibling::td[2]")).getText();
	System.out.println("Youth movie collection:"+movieCollection3);
	String movieIDMB1 = driver.findElement(By.xpath("//td[text()='DHURANDHAR']/following-sibling::td[1]")).getText();
	System.out.println("dhurandar movie IMDB:"+movieIDMB1);
	String movieIDMB2 = driver.findElement(By.xpath("//td[text()='TOXIC']/following-sibling::td[1]")).getText();
	System.out.println("Toxic movie IMDB:"+movieIDMB2);
	String movieIDMB3 = driver.findElement(By.xpath("//td[text()='YOUTH']/following-sibling::td[1]")).getText();
	System.out.println("Youth movie IMDB:"+movieIDMB3);
	String moviePosition1 = driver.findElement(By.xpath("//td[text()='DHURANDHAR']/preceding-sibling::td[1]")).getText();
	System.out.println("Dhurandhar movie position"+moviePosition1);
	String moviePosition2 = driver.findElement(By.xpath("//td[text()='TOXIC']/preceding-sibling::td[1]")).getText();
	System.out.println("Toxic movie position"+moviePosition2);
	String moviePosition3 = driver.findElement(By.xpath("//td[text()='YOUTH']/preceding-sibling::td[1]")).getText();
	System.out.println("YOuth movie position"+moviePosition3);
	driver.quit();
}
}
 