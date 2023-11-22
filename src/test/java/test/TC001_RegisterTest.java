package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;
import pages.InitialPage;

public class TC001_RegisterTest extends ProjectSpecification{
	
	@BeforeTest
	public void setup() {
		
		excelfile="Book1";
		
	}
	
	@Test(dataProvider ="getData" )
	public void registerTest(String firstname, String lastname, String email, String password, String conPassword, String phoneNumber) throws InterruptedException {
		new InitialPage(driver)
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
		.AccountButtonClick()
		.RegisterSuccess();
		
	}

}
