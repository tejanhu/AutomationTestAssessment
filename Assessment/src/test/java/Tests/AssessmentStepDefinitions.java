package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Pages.IndexPage;
import Pages.PIMViewPage;
import Pages.dashboardViewPage;

import com.relevantcodes.extentreports.ExtentReports;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

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
		IndexPage homePage = PageFactory.initElements(driver, IndexPage.class);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
		}
		homePage.enterUser();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
		}
		homePage.enterPass();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
		}
		homePage.navigateToDashboardPage();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		assertEquals("http://opensource.demo.orangehrmlive.com/index.php/dashboard", driver.getCurrentUrl());
		dashboardViewPage dashboard = PageFactory.initElements(driver, dashboardViewPage.class);
		dashboard.navigateToPIMPage();
		PIMViewPage pim = PageFactory.initElements(driver, PIMViewPage.class);
		pim.clickAddEmployee();
	}
	
	
	@Given("^the Add Employee Tab")
	public void verifyPage() {
		assertEquals("http://opensource.demo.orangehrmlive.com/index.php/pim/addEmployee", driver.getCurrentUrl());
	}
	
	@When("^I fill out the Employee Details correctly$")
	public void fillDetailsCorrectly() {
		PIMViewPage pim = PageFactory.initElements(driver, PIMViewPage.class);
		pim.fillEmployeeDetails();
		assertEquals(pim.fNameFilled(),driver.findElement(By.id("firstName")).getText().length()!=0);
		assertEquals(pim.mNameFilled(),driver.findElement(By.id("middleName")).getText().length()!=0);
		assertEquals(pim.lNameFilled(),driver.findElement(By.id("lastName")).getText().length()!=0);
	}

	@And("^I choose to create Login Details$")
	public void createLoginDetails() {
		PIMViewPage pim = PageFactory.initElements(driver, PIMViewPage.class);
		pim.fillLoginDetails();
	}
	
	@And("^I fill out the Login Details correctly$")
	public void verifyLoginDetails() {
		PIMViewPage pim = PageFactory.initElements(driver, PIMViewPage.class);
		assertEquals(pim.loginCheckBoxFilled(),driver.findElement(By.id("user_name")).getText().length()!=0);
		assertEquals(pim.passwordFilled(),driver.findElement(By.id("user_password")).getText().length()!=0);
		assertEquals(pim.rePasswordFilled(),driver.findElement(By.id("re_password")).getText().length()!=0);
	}
	
	@And("^I click the Save button$")
	public void save() {
		PIMViewPage pim = PageFactory.initElements(driver, PIMViewPage.class);
		pim.save();
	}
	
	@Then("^I can see information about the user$")
	public void viewUserInfo() {
		PIMViewPage pim = PageFactory.initElements(driver, PIMViewPage.class);
		assertEquals("http://opensource.demo.orangehrmlive.com/index.php/pim/viewPersonalDetails/empNumber/"+pim.getEmployeeID(),driver.getCurrentUrl());
	}
	
	public void sendReport() {
		ExtentTest test = extent.startTest("Correct Navigation");
		try {
		test.log(LogStatus.PASS, "Successfull, all green!");
		}catch(AssertionError e) {
			test.log(LogStatus.FAIL, "Error, Something broke so fix it!");
			
			fail();
		}finally {
			test.log(LogStatus.INFO, "Current URL: " + driver.getCurrentUrl());
		extent.endTest(test);
		}
	}
	
	@After
	public void tidyUp() {
		sendReport();
		driver.close();
		extent.flush();
	}
	

}
