package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript1 extends BaseClass{
@Test
public void clickOnBooks() {
driver.findElement(By.partialLinkText("BOOKS")).click();
Reporter.log("Books page is displayed",true);
}
}
