package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class ShopByBrand1_LGStorePage extends ProjectSpecification {
	
	@FindBy(xpath="//a[contains(@data-track,'linkContent=Appliances,linkRegion=Nav')]")
	WebElement clickAppliance;
	
	@FindBy(xpath="//a[text()='LG Refrigerators']")
	WebElement clickRefrigerators;
	
	public ShopByBrand1_LGStorePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public ShopByBrand1_LGStorePage Appliance() {                               //clickappliance
		Actions action = new Actions(driver);
		action.moveToElement(clickAppliance).click(clickAppliance).perform();
		//click(clickAppliance);
		return this;
	}
	
	public ShopByBrand2_LGRefrigeratorsPage clickLGRefrigerators() {     //clickrefrigertor
		click(clickRefrigerators);
		return new ShopByBrand2_LGRefrigeratorsPage(driver);
		
	}
}
