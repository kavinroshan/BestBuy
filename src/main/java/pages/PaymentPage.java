package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.ProjectSpecification;

public class PaymentPage  extends ProjectSpecification{
	
	@FindBy(xpath="//input[@id='number']")
	WebElement cardnumber;
	
	@FindBy(xpath="//input[@id='first-name']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='last-name']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@id='address-input']")
	WebElement address;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement city;
	
	@FindBy(xpath="//select[@id='state']")
	WebElement state;
	
//	@FindBy(xpath="//select[@id='state']")
//	WebElement state;
	
	public PaymentPage(WebDriver driver) {                  //constructor
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
public void SelectState() {
	Select obj = new Select(state);
	obj.selectByVisibleText("TN");
	
}
}
