package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PIMViewPage {
	
@FindBy(css="#menu_pim_addEmployee")
public WebElement addEmployeeTab;
@FindBy(id="firstName")
public WebElement fName;
@FindBy(id="middleName")
public WebElement mName;
@FindBy(id="lastName")
public WebElement lName;
@FindBy(id="employeeId")
private WebElement eId;
@FindBy(id="photofile")
public WebElement uploadBtn;
@FindBy(id="chkLogin")
public WebElement loginCheckbox;
@FindBy(id="btnSave")
public WebElement saveBtn;


@FindBy(id="user_name")
public WebElement userName;
@FindBy(id="user_password")
public WebElement password;
@FindBy(id="re_password")
public WebElement rePassword;


public void clickAddEmployee() {
	addEmployeeTab.click();
}

public WebElement getEmployeeID() {
	return eId;
}

public void fillEmployeeDetails() {
	fName.click();
	fName.sendKeys("abcd");
	mName.click();
	mName.sendKeys("abcd");
	lName.click();
	lName.sendKeys("abcd");
//	eId.click();
//EXTRA:
//	uploadBtn.click();
}

public boolean fNameFilled() {
	if(fName.getText().length()!=0) {
		return true;
	}
	return false;
}

public boolean mNameFilled() {
	if(mName.getText().length()!=0) {
		return true;
	}
	return false;
}

public boolean lNameFilled() {
	if(lName.getText().length()!=0) {
		return true;
	}
	return false;
}

public void fillLoginDetails() {
	loginCheckbox.click();
	userName.click();
	password.click();
	rePassword.click();
}

public boolean loginCheckBoxFilled() {
	if(loginCheckbox.isSelected()) {
		return true;
	}
	return false;
}

public boolean userNameFilled() {
	if(userName.getText().length()!=0) {
		return true;
	}
	return false;
}

public boolean passwordFilled() {
	if(password.getText().length()!=0) {
		return true;
	}
	return false;
}

public boolean rePasswordFilled() {
	if(rePassword.getText().length()!=0) {
		return true;
	}
	return false;
}

public void save() {
	saveBtn.click();
}
	

}
