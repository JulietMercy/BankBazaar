package pagesC;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{

	@And("Click Create Lead")
	public CreateLeadPage2 clickCreateLead() {
		WebElement eleCreateLead = locateElement("linktext", "Create Lead");
		click(eleCreateLead);
		return new CreateLeadPage2();
	}
	
	public FindLeadPage clickFindLead() {
		WebElement eleFindLead = locateElement("linktext", "Find Leads");
		click(eleFindLead);
		return new FindLeadPage();
	}
	
}









