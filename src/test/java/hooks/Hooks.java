package hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hooks extends SeMethods {

	/*@Before 
	public void beforeCucumber(Scenario sc)
	{

		System.out.println("Scenario Name is :"+sc.getName());
		System.out.println("Scenario ID is :"+sc.getId());
	}
	@After
	public void afterScenario(Scenario sc)
	{
		System.out.println("SCenario status is :"+sc.getStatus());
	}*/

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
		
		startApp("chrome","http://leaftaps.com/opentaps/");

	}
	@After
	public void afterCucumber(Scenario sc)
	{
		//closeAllBrowsers();
		stopResult();
		
	}
}
