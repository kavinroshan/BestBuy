package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class HomePage extends ProjectSpecification {
	
	@FindBy(xpath="//span[text()='Account']")
	WebElement account;
	
	@FindBy(xpath="//a[text()='Create Account']")
	WebElement createAccount;
	
	@FindBy(xpath="//a[text()='Sign In']")  //Login Button
	WebElement SignInButton;
	
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
	}
	
	public HomePage WaitMethod() throws InterruptedException {
		Wait();
		return this;
		}
	
	public HomePage ClickAlert() throws InterruptedException {
		Alert();
		return this;
	}
	
	public HomePage clickAccount() {
    click(account);
    return this;
}
	
	public RegisterPage clickCreateAccount() {
	    click(createAccount);
	    return new RegisterPage(driver);
	}
	
	public HomePage clickAccount1() {
	    click(account);
	    return this;
	}
	
	public LogInPage ClickSignIn() {
		click(SignInButton);
		return new LogInPage(driver);
	}
	
	
}