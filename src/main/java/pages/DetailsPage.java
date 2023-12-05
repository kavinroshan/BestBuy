package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class DetailsPage extends ProjectSpecification{
	
	@FindBy(xpath="//button[text()='Continue as Guest']")   //continue as guest
	WebElement clickContinue; 
	
	public DetailsPage(WebDriver driver) {    //constructor
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	public CheckOutPage clickContinueAsGuest() {
		click(clickContinue);
		return new CheckOutPage(driver);
	}
}
