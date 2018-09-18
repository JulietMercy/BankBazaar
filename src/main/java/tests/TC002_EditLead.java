package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.ProjectMethods;

public class TC002_EditLead extends ProjectMethods {
	
	@BeforeClass()
	public void setData() {
		testCaseName = "TC002_EditLead";
		testCaseDescription ="Edit a lead";
		category = "Smoke";
		author= "Babu";
		dataSheetName="TC002";
	}
	@Test(dataProvider="fetchData")
	public  void editLead(String phnNumber, String updateCname)  throws InterruptedException {
		
		new MyHomePage()
		.clickLeads()
		.clickFindLead()
		.selectPhoneMenu()
		.typePhoneNo(phnNumber)
		.clickFindLead()
		.clickFRLead()
		.clickEditButton()
		.updateCompanyName(updateCname)
		.updateButton()
		.verifyCName();
		
		/*click(locateElement("linktext", "Leads"));
		click(locateElement("linktext", "Find Leads"));
		click(locateElement("xpath", "//span[text()='Phone']"));
		type(locateElement("name", "phoneNumber"),phnNumber);
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(2000);
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(locateElement("linktext", "Edit"));
		type(locateElement("id", "updateLeadForm_companyName"),updateCname);
		click(locateElement("class", "smallSubmit"));*/
		
	}

}
