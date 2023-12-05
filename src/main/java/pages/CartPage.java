package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class CartPage extends ProjectSpecification {
	
	@FindBy(xpath="//button[contains(@class,'c-button c-button-outline c-button-lg btn-secondary my-bby-total-footer__no-thanks')]")
	WebElement alerthandle;
	
	@FindBy(xpath="//button[text()='Checkout']")
	WebElement clickCheckOut;
	
	public CartPage(WebDriver driver) {    //constructor
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public CartPage AlertHandle() {
		click(alerthandle);
		return this;
	}
	
	public DetailsPage ClickCheckOut() {
		click(clickCheckOut);
		return new DetailsPage(driver);
	}
}
