package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class CountrySelectionPage extends ProjectSpecification {
	
	@FindBy(xpath="(//a[@class='us-link'])[1]")
	WebElement country;
	
	
public CountrySelectionPage(WebDriver driver) {  //constructor
		
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
	}

public InitialPage clickCountry() {
	click(country);
	return new InitialPage(driver);
}

public HomePage clickCountry1() {
	click(country);
	return new HomePage(driver);
}

public ShopProductByDept2_SamsungGalaxyS23Page clickCountry2() {
	click(country);
	return new ShopProductByDept2_SamsungGalaxyS23Page(driver);
}
//public HomePage HomePageMethod() {
//
//	return new HomePage(driver);
//	
//}
}
