/*package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	ChromeDriver driver;
	
	@Given("launch the Browser")
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@And("maximize the browser")
	public void maxmize()
	{
		driver.manage().window().maximize();
	}
	
	
	@And("set the timeout")
	public void timeout()
	{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@And("load URL")
	public void loadURL()
	{
		driver.get("http://leaftaps.com/opentaps/");
	}
	
	
	@And("Enter the username as (.*)")
	public void enterUName(String uName)
	{
		driver.findElementById("username").sendKeys(uName);
	}

	@And("Enter the password as (.*)")
	public void enterPassword(String pWord)
	{
		driver.findElementById("password").sendKeys(pWord);
	}
	
	
	@And("Click Login")
	public void clickLogin()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@And("Click crmsfa link")
	public void clickCRMSFA()
	{
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@And("Click Lead")
	public void clickLead()
	{
		driver.findElementByLinkText("Leads").click();
	}
	
	
	@And("Click Create Lead")
	public void createLead()
	{
		driver.findElementByLinkText("Create Lead").click();
	}
	@And("Enter Company Name as (.*)")
	public void enterCName(String cn) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cn);
	}
	
	@And("Enter First Name as (.*)")
		public void enterFName(String fn) {
		
		driver.findElementById("createLeadForm_firstName").sendKeys(fn);
	}
	@And("Enter Last Name as (.*)")
	public void enterLName(String ln) {
		driver.findElementById("createLeadForm_lastName").sendKeys(ln);
	}
	@When("Click on Create Lead Button")
	public void clcikCreateLead() {
		driver.findElementByClassName("smallSubmit").click();
	}
	@Then("Verify Create Lead is Success")
	public void verifyCL()
	{
		String title = driver.getTitle();
		System.out.println("New Title is :"+title);
		
		if(title.contains("View Lead")){
			System.out.println("Verified");
		}
	}
	
	
}  Login steps will be replaced with pages
*/