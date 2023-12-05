package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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

	//validation
	
	@FindBy(xpath="//p[text()='Please enter your first name.']")
	WebElement firstnameError;

	
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
		System.out.println("Registered Successfully");
		return this;
	}
	
	public RegisterPage AccountButtonClick2() {     //negtiveSignUp validation
		click(createaccountButton);
		
		String source = driver.getPageSource();
		
		
		if(source.contains("Please enter a valid email address."))
			System.out.println("Negative SignUp Pass");
	
		
			else if(source.contains("Please enter a strong password.")) 
			System.out.println("Negative SignUp Pass"); 
		
		
			else if(source.contains("Please reenter your password.")) 
			System.out.println("Negative SignUp Pass"); 
		
		
			else if(source.contains("Please enter a valid mobile phone number.")) 	
			System.out.println("Negative SignUp Pass"); 
		
		
			else {
				System.out.println("Negative SignUp Fail");
			}

		return this;
	}

}
