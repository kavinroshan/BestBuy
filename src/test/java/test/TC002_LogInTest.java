package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.InitialPage;

public class TC002_LogInTest extends ProjectSpecification {
	
	@BeforeTest
	public void setup() {
		
		excelfile="TC002_BestBuyLogIn";
		
	}
	
	@Test(dataProvider ="getData" )
	public void logInTest(String email, String password) throws InterruptedException {
		new InitialPage(driver)
		.clickCountry1()
		.WaitMethod()
		//.ClickAlert()
		.clickAccount1()
		.ClickSignIn()
		.Email(email)
		.passWord(password)
		.ActionClass();
		
	}

}
