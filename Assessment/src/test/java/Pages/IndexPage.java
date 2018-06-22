package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class IndexPage {
	
@FindBy(id="txtUsername")
public WebElement username;

@FindBy(id="txtPassword")
public WebElement password;
	
@FindBy(id="btnLogin")
public WebElement loginBtn;

public void enterUser() {
	username.click();
}

public void enterPass() {
	password.click();
}

public void clickLogin() {
	loginBtn.click();
}
	
	

}
