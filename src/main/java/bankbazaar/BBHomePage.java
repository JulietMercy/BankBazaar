package bankbazaar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.MyHomePage;
import wdMethods.ProjectMethods;
//import wdMethods.SeMethods;
public class BBHomePage extends ProjectMethods {

	//Cucumber with POM
	@And("Click on Investment")
	public MutualFundPage selectInvest() throws InterruptedException {
		Thread.sleep(1000);
		WebElement findElement = driver.findElement(By.linkText("INVESTMENTS"));
		mouseAction(findElement, "Mutual Funds");
		return new MutualFundPage();
	}

	
}
