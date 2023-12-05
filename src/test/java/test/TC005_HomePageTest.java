package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.CountrySelectionPage;
import pages.HomePage;


public class TC005_HomePageTest extends ProjectSpecification{
    
	
	
	@Test //(dataProvider ="getData" )
	public void HomePageTest() throws InterruptedException  {
		new CountrySelectionPage(driver)
		.clickCountry1()
		.blackFridayDeals()
		.dealsOfTheDay()
		.Membership()
		.creditCard()
		.giftCard()
		.giftIdeas()
		.moreButton()
		.WaitMethod()
		.bestBuySells()
		.moreButton()
		.donateToJude()
		.moreButton()
		.bestBuyOutlet()
		.moreButton()
		.bestByBusiness()
		.moreButton()
		.CloseMore();
		
	
		
		
		
	}


}
