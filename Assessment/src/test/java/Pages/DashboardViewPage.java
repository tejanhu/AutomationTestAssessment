package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class DashboardViewPage {
	
@FindBy(css="#menu_dashboard_index > b")
public WebElement dashboardNavbar;

	
@FindBy(css="#menu_pim_viewPimModule > b")
public WebElement pimNavbar;

public void navigateToPIMPage() {
	dashboardNavbar.click();
}
	

}
