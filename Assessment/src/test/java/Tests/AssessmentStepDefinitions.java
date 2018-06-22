package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.ExtentReports;

import cucumber.api.java.Before;

public class AssessmentStepDefinitions {
	
	WebDriver driver;
	static ExtentReports extent;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		assertNotNull(driver);
		extent = new ExtentReports("C:\\Users\\Admin\\eclipse-workspace\\TestAutomationAssessment\report.html", true);
		driver.navigate().to("http://opensource.demo.orangehrmlive.com/index.php");
		assertEquals("http://opensource.demo.orangehrmlive.com/index.php",driver.getCurrentUrl());
	}
	
	
	@Given("^the Add Employee Tab")
	public void
	
	@When("^I fill out the Employee Details correctly$")
	
	@And("^I choose to create Login Details$")
	
	@And("^I fill out the Login Details correctly$")
	
	@And("^I click the Save button$")
	
	@Then("^I can see information about the user$")
	
	
	

}
