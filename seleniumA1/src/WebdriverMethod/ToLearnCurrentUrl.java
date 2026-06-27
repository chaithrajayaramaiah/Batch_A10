package WebdriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnCurrentUrl {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	//driver.get("https://www.makemytrip.com/");
//	String url = driver.getCurrentUrl();
//	System.out.println(url);
//	if(url.equals("https://www.makemytrip.com/")) {
	//	System.out.println("WelcomePage is displayed");
		
//	}else {
	//	System.out.println("welcomepage is not displayed");
//	}
	driver.get("https://www.ajio.com/");
	String url = driver.getCurrentUrl();
	System.out.println(url);
	if(url.equals("https://www.ajio.com/")) {
		System.out.println("welcomepage is displayed");
	}else {
		System.out.println("welcomepage is not displayed");
	}
}
}
