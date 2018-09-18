package bankbazaar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CreateLeadPage;
import wdMethods.ProjectMethods;
//import wdMethods.SeMethods;
public class MutualFundPage extends ProjectMethods {

	//Cucumber with POM
	@And("Click Search for Mutual Fund")
	public SelectAge clickMFButton() throws InterruptedException {
		Thread.sleep(2000);
		WebElement eleMFBut = locateElement("linktext", "Search for Mutual Funds");
		click(eleMFBut);
		return new SelectAge();
	}

	

	
}



