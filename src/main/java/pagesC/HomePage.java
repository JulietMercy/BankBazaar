package pagesC;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods{

	@And("Click crmsfa link")
	public MyHomePage clickCRMSFA() {
		WebElement eleCRMSFA = locateElement("linktext", "CRM/SFA");
		click(eleCRMSFA);
		return new MyHomePage();
	}
	
}









