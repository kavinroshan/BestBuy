package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.CountrySelectionPage;

public class TC004_NegativeLogIn_Testcase extends ProjectSpecification {

	@BeforeTest
	public void setup() {
		
		excelfile="Negative_LogIn_TestCase";	
	}
	
	@Test(dataProvider ="getData" )
	public void logInTest(String email, String password) throws InterruptedException {
		new CountrySelectionPage(driver)
		.clickCountry()
		.WaitMethod()
		.clickAccount()
		//.ClickAlert()
		.ClickSignIn()
		.Email(email)
		.passWord(password)
		.SingInButton2();
		
	}

}
