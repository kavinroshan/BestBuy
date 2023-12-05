package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpecification;


public class HomePage extends ProjectSpecification {

	@FindBy(xpath="(//a[contains(text(),'Black Friday Deals')])[1]")      
	WebElement blackFriday; 
	
	@FindBy(xpath="//a[contains(text(),'Deal of the Day')][1]")      
	WebElement dealsOfTheDay;
	
	@FindBy(xpath="//a[@data-lid='hdr_my_best_buy_memberships']")      
	WebElement memberships;
	
	@FindBy(xpath="//a[@data-lid='hdr_crd']")      
	WebElement creditCards;
	
	@FindBy(xpath="//a[@data-lid='hdr_gift_cards']")      
	WebElement giftCards;
	
	@FindBy(xpath="//a[@data-lid='hdr_gift_ideas']")      
	WebElement giftIdeas;
	
	@FindBy(xpath="//span[contains(text(),'More')]")      
	WebElement morebutton;
	
	@FindBy(xpath="//li[@class='liDropdownList'][1]")      
	WebElement yesBestBuySells;
	
	@FindBy(xpath="//li[@class='liDropdownList'][2]")      
	WebElement donateToJude;
	
	@FindBy(xpath="//li[@class='liDropdownList'][3]")      
	WebElement bestBuyOutlet;
	
	@FindBy(xpath="//li[@class='liDropdownList'][4]")      
	WebElement bestBuyBusiness;
	
	@FindBy(xpath="//span[@class='accountMenuCloseText']")      
	WebElement close;
	
	
	@FindBy(xpath=" //a[text()='Accessibility']")     //bottom link
	WebElement bottomLink;
	
	@FindBy(id = "gh-search-input")               //searchbox
	WebElement searchBox;
	
	@FindBy(xpath="//button[@title='submit search']")
	WebElement searchButton;
	
	public HomePage(WebDriver driver) {               //constructor
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public HomePage WaitMethod() throws InterruptedException {
		Wait();
		return this;
	}
	
	
	public HomePage blackFridayDeals() {
		try {
			click(blackFriday);
			String actual = driver.getTitle();
			String expected = "Best Buy Black Friday Deals 2023";
			Assertion(actual, expected);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//System.out.println(actual);
		return this;
	}
	
	public HomePage dealsOfTheDay() {
		click(dealsOfTheDay);
		String actual = driver.getTitle();
		String expected = "Deal of the Day: Electronics Deals - Best Buy";
		Assertion(actual, expected);
		//System.out.println(actual);
		return this;
	}
	
	public HomePage Membership() {
		click(memberships);
		String actual = driver.getTitle();
		String expected = "My Best Buy Memberships";
		Assertion(actual, expected);
		//System.out.println(actual);
		return this;
	}
	
	public HomePage creditCard() {
		click(creditCards);
		String actual = driver.getTitle();
		String expected = "Best Buy Credit Card: Rewards & Financing";
		Assertion(actual, expected);
		//System.out.println(actual);
		return this;
	}
	
	public HomePage giftCard() {
		click(giftCards);
		String actual = driver.getTitle();
		String expected = "Gifts Cards and E-Gift Cards - Best Buy";
		Assertion(actual, expected);
		//System.out.println(actual);
		return this;
	}
	
	public HomePage giftIdeas() {
		click(giftIdeas);
		String actual = driver.getTitle();
		String expected = "Gift Ideas 2023: Best Gifts to Give This Year - Best Buy";
		Assertion(actual, expected);
		//System.out.println(actual);
		return this;
	}
	
	public HomePage moreButton() {   //morebutton
		click(morebutton);
		return this;
	}
	
	public HomePage bestBuySells() {
		click(yesBestBuySells);
		String actual = driver.getTitle();
		String expected = "Yes, Best Buy Sells That – Best Buy";
		Assertion(actual, expected);
		return this;
	}
	
	public HomePage donateToJude() {
		click(donateToJude);
		String actual = driver.getTitle();
		String expected ="St. Jude Children's Research Hospital - Best Buy";
		Assertion(actual, expected);
		//System.out.println(actual);
		return this;
	}
	
	public HomePage bestBuyOutlet() {
		click(bestBuyOutlet);
		String actual = driver.getTitle();
		String expected ="Best Buy Outlet: Clearance Electronics Outlet Store – Best Buy";
		Assertion(actual, expected);
		//System.out.println(actual);
		return this;
	}
	
	public HomePage bestByBusiness() {
		click(bestBuyBusiness);
		String actual = driver.getTitle();
		String expected ="Best Buy for Business - Best Buy";
		Assertion(actual, expected);
		//System.out.println(actual);
		return this;
	}
	
	public HomePage CloseMore() {                                //closemenu
		click(close);
		//System.out.println("Close");
		return this;
	}
	
	public HomePage BottomLink() {                                  //bottomlink
		Actions action = new Actions(driver);
		action.moveToElement(bottomLink).click(bottomLink).perform();
		String actual = driver.getTitle();
		String expected ="Accessibility - Best Buy";
		Assertion(actual, expected);
		
		return this;
	}
	
	
	public HomePage SearchBox(String product) {    //searchforitem
		sendKeys(searchBox, product);
		return this; 
	}
	
	
	public SearchProduct_MobilePage SearchButton() {       //clicksearchbutton
		click(searchButton);
		return new SearchProduct_MobilePage(driver); 
	}
	
	
}
