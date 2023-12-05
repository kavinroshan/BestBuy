package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class SearchProduct_OnePlusNordPage extends ProjectSpecification{
	
	@FindBy(xpath="//button[@data-sku-id='6543735']")    //addtocart
	WebElement addToCart;
	
	@FindBy(xpath="//button[contains(text(),'Continue shopping')]")   //continue shopping
	WebElement continueShop;
	
	@FindBy(xpath="//button[@aria-label='Menu']")
	WebElement menuButton;
	
	@FindBy(xpath="//button[text()='Cell Phones']")
	WebElement cellPhones;
	
	@FindBy(xpath="//button[text()='Samsung Galaxy']")
	WebElement samsungGalaxy;
	
	
	
	@FindBy(xpath="//a[text()='Samsung Galaxy S23']")
	WebElement clickSamsungS23;
	
	public SearchProduct_OnePlusNordPage(WebDriver driver) {       //constructor
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public SearchProduct_OnePlusNordPage AddToCart() {                  //addtocart
		Actions action = new Actions(driver);
		action.moveToElement(addToCart).click(addToCart).perform();
		return this;
		
	}
	
	public SearchProduct_OnePlusNordPage WaitMethod() throws InterruptedException {
		Wait();
		return this;
	}
	
	public SearchProduct_OnePlusNordPage ContinueShopping() {    //continueshopping
		click(continueShop);
		return this;
	}
	
	public SearchProduct_OnePlusNordPage ClickMenuButton() {         //clickmenu
		click(menuButton);
		return this;
	}
	
	public SearchProduct_OnePlusNordPage ClickCellPhones() {           //SelectProductByDept
		click(cellPhones);
		return this;
	}
	
	public SearchProduct_OnePlusNordPage ClickSamsungGalaxy() {        //clicksamsung
		click(samsungGalaxy);
		return this;
	}
	

	public ShopProductByDept1_SamsungGalaxyS23SeriesPage ClickSamsungS23() {      //choosemodelS23
		click(clickSamsungS23);
		return new ShopProductByDept1_SamsungGalaxyS23SeriesPage(driver);
	}
	
	
}
