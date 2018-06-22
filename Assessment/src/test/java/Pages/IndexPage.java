package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class IndexPage {
	
@FindBy(id="txtUsername")
public WebElement username;

@FindBy(id="txtPassword")
public WebElement password;
	
@FindBy(xpath="//*[@id=\"btnLogin\"]")
public WebElement loginBtn;

public void enterUser() {
	username.click();
	username.sendKeys("Admin");
}

public void enterPass() {
	password.click();
	password.sendKeys("admin");
}

public void navigateToDashboardPage() {
	loginBtn.click();
}
	
	

}
