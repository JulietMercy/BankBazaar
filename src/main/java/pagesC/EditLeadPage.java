package pagesC;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods{
	
	
	public EditLeadPage updateCompanyName(String data) {
		WebElement eleUCompanyName = locateElement("id", "updateLeadForm_companyName");
		eleUCompanyName.clear();
		type(eleUCompanyName,data);
		return this;
	}
	
	public ViewLeadPage updateButton() {
		WebElement eleUpdateButton = locateElement("class", "smallSubmit");
		click(eleUpdateButton);
		return new ViewLeadPage();
	}
	
	
	

	
}