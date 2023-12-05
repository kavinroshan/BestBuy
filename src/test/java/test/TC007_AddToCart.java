package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.CountrySelectionPage;

public class TC007_AddToCart extends ProjectSpecification{
	
	@BeforeTest
	public void setup() {
		
		excelfile="TC005_AddToCart";
	}
	
	@Test (dataProvider ="getData" )
	public void AddToCartPageTest(String product, String firstname, String lastname, String phonenumber, String email, String EMail, String PhNum) throws InterruptedException {	
		
		new CountrySelectionPage(driver)
//		.clickCountry2()
		.clickCountry1()
		.SearchBox(product)
		.SearchButton()
		.Mobile()
		.AddToCart()
		.WaitMethod()
		.ContinueShopping()
		.ClickMenuButton()
		.ClickCellPhones()
		.ClickSamsungGalaxy()
		.ClickSamsungS23()
		.clickSamsungGalxyS23()
		.WaitMethod()
		.MoveToSave()
		.ClickAddToCart()
		.ClickContinueShopping()
		.ClickMenu()
		.ClickBrand()
		.ClickLG()
		.Appliance()
		.clickLGRefrigerators()
		.clickRefrigeratorLink()
		.clickAddToCart()
		.clickGoToCart()
		.AlertHandle()
		.ClickCheckOut()
		.clickContinueAsGuest()
		.clickNameDetails()
		.Firstname(firstname)
		.Lastname(lastname)
		.PhoneNumber(phonenumber)
		.Email(email)
		.clickApply()
		.ContactEmailAdress(EMail)
		.ContactPhoneNum(PhNum)
		.clickContinuePayment();
		
		
	}

}
