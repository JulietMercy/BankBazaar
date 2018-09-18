package pagesC;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
//import wdMethods.ProjectMethods;
import wdMethods.SeMethods;


//TestNG with POM
public class LogInPage extends SeMethods{

	@And("Enter the username as (.*)")
	public LogInPage typeUserName(String data) {
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, data);
		return this;
	}
	@And("Enter the password as (.*)")
	public LogInPage typePassword(String data) {
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, data);
		return this;
	}
	@And("Click Login")
	public HomePage clickLogin() {
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		return new HomePage();
	}
	
}









