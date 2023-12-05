package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification ;

public class ShopByBrand3_LG23_RefrigeratorPage extends ProjectSpecification {

	@FindBy(xpath="//button[@data-sku-id='6544317']")
	WebElement clickAddToCart;

	@FindBy(xpath="//a[text()='Go to Cart']")
	WebElement clickGoToCart;
	
	public ShopByBrand3_LG23_RefrigeratorPage(WebDriver driver) {    //constructor
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public ShopByBrand3_LG23_RefrigeratorPage clickAddToCart() {
		Actions action = new Actions(driver);
		action.moveToElement(clickAddToCart).click(clickAddToCart).perform();
		return this;
	}
	
	public CartPage clickGoToCart() {
		click(clickGoToCart);
		return new CartPage(driver);
	}
}
