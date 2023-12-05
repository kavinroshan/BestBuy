package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.CountrySelectionPage;

public class TC002_NegativeRegisterTest extends ProjectSpecification {

	@BeforeTest
	public void setup() {
		
		excelfile="Negative_RegisterTestCase";
		
	}
	
	@Test(dataProvider ="getData" )
	public void registerTest(String firstname, String lastname, String email, String password, String conPassword, String phoneNumber) throws InterruptedException {
		new CountrySelectionPage(driver)
		.clickCountry()
		.WaitMethod()
		.clickAccount()
		.clickCreateAccount()
		.firstName(firstname)
		.lastName(lastname)
		.Email(email)
		.Password(password)
		.ConfirmPassword(conPassword)
		.PhoneNum(phoneNumber)
		.ActionsMethod()
		.AccountButtonClick2();
		
	}

}


