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
public WebElement eId;

@FindBy(id="photofile")
public WebElement uploadBtn;

@FindBy(id="chkLogin")
public WebElement loginCheckbox;

@FindBy(id="btnSave")
public WebElement saveBtn;


public void clickAddEmployee() {
	addEmployeeTab.click();
}

public void fillDetails() {
	fName.click();
	mName.click();
	lName.click();
	eId.click();
//	uploadBtn.click();
	loginCheckbox.click();
	saveBtn.click();
}

	

}
