package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class InitialPage extends ProjectSpecification {
	
	@FindBy(xpath="(//a[@class='us-link'])[1]")
	WebElement country;
	
	
public InitialPage(WebDriver driver) {
		
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
	}

public HomePage clickCountry() {
	click(country);
	return new HomePage(driver);
}

public HomePage clickCountry1() {
	click(country);
	return new HomePage(driver);
}
}
