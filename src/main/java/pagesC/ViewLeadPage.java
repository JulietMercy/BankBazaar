package pagesC;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{
	
	public EditLeadPage clickEditButton() {
		WebElement eleEditButton = locateElement("xpath", "//a[text()='Edit']");
		click(eleEditButton);
		return new EditLeadPage();
	}
	
	public ViewLeadPage verifyCName()
	{
		WebElement eleVCName = locateElement("id","viewLead_companyName_sp");
		String text = eleVCName.getText();
		System.out.println("VErify TExt is :"+text);
		verifyPartialText(eleVCName,"CTS");
		return this;
	}
	
}