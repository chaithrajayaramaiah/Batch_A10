package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	

@FindBy(linkText = "Register")
private WebElement regLink;
@FindBy(linkText = "Log in")
private WebElement loginlink;
@FindBy(id="small-searchterms")
private WebElement searchtf;
@FindBy(xpath = "Search")
private WebElement Searchbtn;
public WelcomePage(WebDriver driver) {
	PageFactory.initElements( driver,this);
	
	
}

public WebElement getRegLink() {
	return regLink;
}

public WebElement getLoginlink() {
	return loginlink;
}

public WebElement getSearchtf() {
	return searchtf;
}

public WebElement getSearchbtn() {
	return Searchbtn;
}

}