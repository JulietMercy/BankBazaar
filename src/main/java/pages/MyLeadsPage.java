package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{

	
	public CreateLeadPage clickCreateLead() {
		WebElement eleCreateLead = locateElement("linktext", "Create Lead");
		click(eleCreateLead);
		return new CreateLeadPage();
	}
	
	public FindLeadPage clickFindLead() {
		WebElement eleFindLead = locateElement("linktext", "Find Leads");
		click(eleFindLead);
		return new FindLeadPage();
	}
	
}









