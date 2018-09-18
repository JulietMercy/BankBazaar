package bankbazaar;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.DataInputProvider;
import wdMethods.SeMethods;

public class ProjectMethods extends SeMethods{

	public String dataSheetName;
	@Parameters({"url"})
	@BeforeMethod
	public void login(String url) {
		startApp("chrome", url);
		
	}
	
	@AfterMethod(groups="common")
	public void close() {
		//closeAllBrowsers();
	}
	
	@DataProvider(name="fetchData")
	public String[][] getData() {
	return DataInputProvider.getSheet(dataSheetName);
	}
	
	
	
	
	
	
	
	
	
}