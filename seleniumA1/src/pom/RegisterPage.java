package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
@FindBy(id = "gender-female")
private WebElement gender;
@FindBy(id = "FirstName")
private WebElement firstnametf;
@FindBy(id ="LastName")
private WebElement lastnametf;
@FindBy(id="Email")
private WebElement emailtf;
@FindBy(id="Password")
private WebElement passwordtf;
@FindBy(id = "ConfirmPassword")
private WebElement confirmpasswordtf;
@FindBy(id="register-button")
private WebElement registerbtn;
public RegisterPage(WebDriver driver) {
	PageFactory.initElements( driver,this);
}
public WebElement getGender() {
	return gender;
}
public WebElement getFirstnametf() {
	return firstnametf;
}
public WebElement getLastnametf() {
	return lastnametf;
}
public WebElement getEmailtf() {
	return emailtf;
}
public WebElement getPasswordtf() {
	return passwordtf;
}
public WebElement getConfirmpasswordtf() {
	return confirmpasswordtf;
}
public WebElement getRegisterbtn() {
	return registerbtn;
}

}
