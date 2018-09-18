package bankbazaar;
import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CreateLeadPage;
import wdMethods.ProjectMethods;
public class SelectAge extends ProjectMethods {

	
	int age=Integer.parseInt("28");
	String mon="Dec";
	String dat="11";
			String sal="67000";
	String bank="SBI";
	@And("Select Year")
	public SelectAge clickYear() throws InterruptedException {
		Thread.sleep(5000);
		WebElement eleYear = locateElement("xpath", "//div[@class='rangeslider__handle-label']");
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(eleYear, (age-18)*8, 0).perform();
		//click(eleYear);
		return this;
	}
	@And("Select Month")
	public SelectAge clickMonth() throws InterruptedException {
		Thread.sleep(500);
		WebElement eleMon = locateElement("xpath", "//a[contains(text(),'"+mon+"')]");
		click(eleMon);
		return this;
	}
	@And("Select date")
	public SelectAge clickDate() throws InterruptedException {
		Thread.sleep(500);
		WebElement eleDat = locateElement("xpath", "//div[text()='"+dat+"']");
		click(eleDat);
		//driver.switchTo().alert().dismiss();
		return this;
	}
	@And("Clcik on Continue1")
	public SelectAge clickContinue() throws InterruptedException {
		Thread.sleep(500);
		WebElement eleCon = locateElement("xpath", "//a[text()='Continue']");
		click(eleCon);
		
		return this;
	}
	
	@And("Select Salary")
	public SelectAge selSalary() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Hai");
		WebElement eleSal = locateElement("name", "netAnnualIncome");
		type(eleSal,"67000");
				return this;
	}
	
	@And("Clcik on Continue2")
	public SelectAge clickCont2() throws InterruptedException {
		Thread.sleep(2000);
		WebElement eleCon2 = locateElement("xpath", "//a[text()='Continue']");
		click(eleCon2);
		
		return this;
	}
	
	@And("Select Bank")
	public SelectAge selBank() throws InterruptedException {
		Thread.sleep(2000);
		WebElement eleBank = locateElement("xpath", "//span[text()='"+bank+"']");
		click(eleBank);
		
		return this;
	}
	
	@And("Enter First Name")
	public SelectAge enterName() throws InterruptedException {
		Thread.sleep(2000);
		WebElement eleFname = locateElement("name", "firstName");
		type(eleFname,"Melvin");
		
		return this;
	}
	
	@When("Click on View Mutual Fund")
	public InvestPage viewMututalFund() throws InterruptedException {
		Thread.sleep(1000);
		WebElement eleMutFund = locateElement("xpath", "//a[text()='View Mutual Funds']");
	click(eleMutFund);
		System.out.println("VMF");
		return new InvestPage();
	}
	
	
	
	
}
