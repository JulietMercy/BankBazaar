package bankbazaar;
import java.util.List;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;
public class InvestPage extends ProjectMethods {
@Then("Click on investPage")
	public InvestPage investPage()
	{
		System.out.println("INvest Page");
		List<WebElement> allSchemes = driver.findElementsByClassName("js-offer-name");
		for(WebElement eachScheme:allSchemes)
		{
			System.out.println(eachScheme.getText());
			WebElement eleAmount=driver.findElementByXPath("//span[contains(text(),'"+eachScheme.getText()+"')]/following::span[@class='fui-rupee bb-rupee-xs']/..");
		System.out.println("AMount is :"+eleAmount.getText());
		}
		return this;
	}
	
}
