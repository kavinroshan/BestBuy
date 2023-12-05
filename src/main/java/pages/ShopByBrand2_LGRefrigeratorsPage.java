package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class ShopByBrand2_LGRefrigeratorsPage  extends ProjectSpecification{

	@FindBy(xpath="//a[contains(text(),'LG - 23 Cu. Ft. French Door Counter-Depth Smart Refrigerator with Ice Maker - Stainless Steel')]")
	WebElement clickRefLink;
	
	public ShopByBrand2_LGRefrigeratorsPage(WebDriver driver) {         //constructor
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	public ShopByBrand3_LG23_RefrigeratorPage clickRefrigeratorLink() {
		click(clickRefLink);
		return new ShopByBrand3_LG23_RefrigeratorPage(driver);
	}
}

