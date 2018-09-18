package pages;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import wdMethods.SeMethods;

public class CreateLeadPage2 extends SeMethods{

	
	//Cucumber with POM
	@And("Enter Company Name as (.*)")
	public CreateLeadPage2 typeCompanyName(String data) {
		WebElement eleCompanyName = locateElement("id", "createLeadForm_companyName");
		type(eleCompanyName, data);
		return this;
	}
	
	@And("Enter First Name as (.*)")
	public CreateLeadPage2 typeFirstName	(String data) {
		WebElement eleFirstName = locateElement("id", "createLeadForm_firstName");
		type(eleFirstName, data);
		return this;
	}
	@And("Enter Last Name as (.*)")
	public CreateLeadPage2 typeLastName	(String data) {
		WebElement eleLastName = locateElement("id", "createLeadForm_lastName");
		type(eleLastName, data);
		return this;
	}
	@When("Click on Create Lead Button")
	public CreateLeadPage2 clickCreateLead() {
		WebElement eleCreateLead= locateElement("class", "smallSubmit");
		click(eleCreateLead);
		return this; 
	}
	
}









