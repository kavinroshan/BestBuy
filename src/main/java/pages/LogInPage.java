package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class LogInPage extends ProjectSpecification{
	
	@FindBy(xpath="//input[@id='fld-e']")    //email
	WebElement email;
	
	@FindBy(xpath="//input[@id='fld-p1']")   //password
	WebElement passWord;
	
	@FindBy(xpath="//button[text()='Sign In']") //signin
	WebElement signInButton;
	
	
	
	public LogInPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public LogInPage WaitMethod() throws InterruptedException {
		Wait();
		return this;
	}
	
	public LogInPage Email(String mail) {
		sendKeys(email, mail);
		return this;
	}

	public LogInPage passWord(String pass) {
		sendKeys(passWord, pass);
		return this;
	}
	
	
	public LogInPage SingInButton() {		
		click(signInButton);
		System.out.println("Signin Successfully");
		return this;
		
	}

	public LogInPage SingInButton2() {		          //negtiveLogin validation
		click(signInButton);
		String source = driver.getPageSource();
		
		if(source.contains("Please enter a valid email address."))
			System.out.println("Negative LogIn Pass");
		
		else if(source.contains("Please enter your password."))
			System.out.println("Negative LogIn Pass");
		
		else {
			System.out.println("Negative LogIn Fail");
		}
		return this;
	}
}
