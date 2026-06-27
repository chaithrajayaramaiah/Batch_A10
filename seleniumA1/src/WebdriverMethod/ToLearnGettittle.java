package WebdriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToLearnGettittle {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ajio.com/");
	//Online Shopping Site for Women, Men, Kids Fashion, Lifestyle & More.
	String tittle = driver.getTitle();
	System.out.println(tittle);
	if(tittle.equals("Online Shopping Site for Women, Men, Kids Fashion, Lifestyle & More.")) {
		System.out.println("welcome page is displayed");
	}else {
		System.out.println("welcome page is not dispalyed");
	}
}
}
