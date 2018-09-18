package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods{
	
	//To use Page Factory init the Constructor
	public FindLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Using Page Factory for Phone Menu
	@CacheLookup
	@FindBy(xpath="//span[text()='Phone']")
	WebElement elePhone;
	public FindLeadPage selectPhoneMenu() {
		//WebElement elePhone = locateElement("xpath", "//span[text()='Phone']");
		click(elePhone);
		return this;
	}
	
	//using page Factory FindBYs for Phone No
	@CacheLookup
	@FindBys({ @FindBy(name="phoneNumber"), @FindBy(xpath="//input[@class=' x-form-text x-form-field ']")})
	WebElement elePhoneNo;
	public FindLeadPage typePhoneNo(String data) {
		//WebElement elePhoneNo = locateElement("name", "phoneNumber");
		type(elePhoneNo,data);
		return this;
	}
	
	
	
	//using Page Factory FindByAll
	@CacheLookup
	@FindAll({ @FindBy(xpath="//button[text()='Find Leads']"), @FindBy(id="ext-gen341")})
	WebElement eleFindLeadButton;
	public FindLeadPage clickFindLead() {
		//WebElement eleFindLeadButton = locateElement("xpath", "//button[text()='Find Leads']");
		click(eleFindLeadButton);
		return this;
	}
	public ViewLeadPage clickFRLead() {
		WebElement eleFRButton = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		click(eleFRButton);
		return new ViewLeadPage();
	}
	
}