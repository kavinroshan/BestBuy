package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.gson.GsonExtentTypeAdapterBuilder.Builder;

import base.ProjectSpecification;

public class RegisterPage extends ProjectSpecification {         //constructor

	
	@FindBy(xpath="//input[@id='firstName']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='lastName']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='fld-p1']")
	WebElement passWord;
	
	@FindBy(xpath="//input[@id='reenterPassword']")
	WebElement conPass;
	
	@FindBy(xpath="//input[@id='phone']")
	WebElement phoneNumber;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement createaccountButton;

	
	
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public RegisterPage firstName(String firstname) {
		sendKeys(firstName, firstname);
		return this;
	}
	
	public RegisterPage lastName(String lastname) {
		sendKeys(lastName, lastname);
		return this;
	}
	
	public RegisterPage Email(String mail) {
		sendKeys(email, mail);
		return this;
	}
	
	public RegisterPage Password(String pass) {
		sendKeys(passWord, pass);
		return this;
	}
	
	public RegisterPage ConfirmPassword(String conpass) {
		sendKeys(conPass, conpass);
		return this;
	}
	
	public RegisterPage PhoneNum(String num) {
		sendKeys(phoneNumber, num);
		return this;
	}
	
    public RegisterPage ActionsMethod() {
	  Actions builder = new Actions(driver);
	  builder.moveToElement(createaccountButton);
	  return this;
		
		}
	
	public RegisterPage AccountButtonClick() {
		click(createaccountButton);
		return this;
	}
	
public RegisterPage RegisterSuccess() {
	System.out.println("Registered Successfully");
	return null;
}
}
