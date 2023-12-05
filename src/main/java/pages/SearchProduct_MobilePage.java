package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class SearchProduct_MobilePage extends ProjectSpecification {  
	
	@FindBy(xpath="//a[text()='OnePlus - Nord N30 5G 128GB (Unlocked) - Chromatic Gray']")
	WebElement onePlus;		

	public SearchProduct_MobilePage(WebDriver driver) {       //constructor
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public SearchProduct_OnePlusNordPage Mobile() {
		click(onePlus);
		return new SearchProduct_OnePlusNordPage(driver);
	}

}
