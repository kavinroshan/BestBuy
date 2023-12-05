package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class CheckOutPage extends ProjectSpecification {
	
	@FindBy(xpath="//span[text()='Add a new pickup person']")
	WebElement clickAddName;
	
	@FindBy(xpath="//input[@id='firstName']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='lastName']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='phoneNumber']")
	WebElement phoneNumber;
	
	@FindBy(xpath="//input[@id='emailAddress']")
	WebElement email;
	 
	@FindBy(xpath="//button[contains(@data-track,'Save pick up person')]") //applybutton
	WebElement clickApply;
	
	@FindBy(xpath="//input[@id='user.emailAddress']")    //further email
	WebElement ContactEmailAddress;
	
	@FindBy(xpath="//input[@id='user.phone']")
	WebElement ContactPhoneNum;
	
	@FindBy(xpath="//button[@class='btn btn-lg btn-block btn-secondary']")
	WebElement continuePaymentButton;
	
	public CheckOutPage(WebDriver driver) {                  //constructor
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public CheckOutPage AlertDismissMethod() throws InterruptedException {
		Alert();
		return this;
	}
	
	public CheckOutPage clickNameDetails() {
		click(clickAddName);
		return this;
	}
	
	public CheckOutPage Firstname(String firstname) {
		sendKeys(firstName, firstname);
		return this;
	}
	
	public CheckOutPage Lastname(String lastname) {
		sendKeys(lastName, lastname);
		return this;
	}
	
	public CheckOutPage PhoneNumber(String phonenumber) {
		sendKeys(phoneNumber, phonenumber);;
		return this;
	}
	
	public CheckOutPage Email(String mail) {
		sendKeys(email, mail);
		return this;
	}
	
	public CheckOutPage clickApply() {
		click(clickApply);
		return this;
	}
	      
	public CheckOutPage ContactEmailAdress(String emailaddress) {               //Contactinfo
		Actions action = new Actions(driver);
		action.moveToElement(ContactEmailAddress).sendKeys(ContactEmailAddress, emailaddress).perform();
		return this;
	}
	
	public CheckOutPage ContactPhoneNum(String PhoneNum) {
		Actions action = new Actions(driver);
		action.moveToElement(ContactPhoneNum).sendKeys(ContactPhoneNum, PhoneNum).perform();
		return this;
	}
	
	public CheckOutPage clickContinuePayment() {
		click(continuePaymentButton);
		System.out.println("Order Placed");
		//return new PaymentPage(driver);
		return this;
	}
	
}
