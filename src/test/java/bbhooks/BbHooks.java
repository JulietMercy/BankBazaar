package bbhooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class BbHooks  extends SeMethods {

	@Before
	public void beforeCucumber(Scenario sc)
	{
		//Calling Before Suite Method
		startResult();

		//Calling Before Class Method
		testCaseName = sc.getName();
		testCaseDescription =sc.getId();
		category = "Smoke";
		author= "Babu";

		//Calling Before Method

		startTestCase();

		//Calling at test

		startApp("chrome","https://www.bankbazaar.com");

	}
	@After
	public void afterCucumber(Scenario sc)
	{
		//closeAllBrowsers();
		stopResult();

	}
}


