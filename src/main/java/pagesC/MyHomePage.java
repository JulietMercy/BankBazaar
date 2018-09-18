package pagesC;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods{

	@And("Click Lead")
	public MyLeadsPage clickLeads() {
		WebElement eleLeads = locateElement("linktext", "Leads");
		click(eleLeads);
		return new MyLeadsPage();
	}
	
}









