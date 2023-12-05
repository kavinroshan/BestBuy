package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class ShopProductByDept1_SamsungGalaxyS23SeriesPage extends ProjectSpecification {
	
	@FindBy(xpath="//a[text()='Shop Galaxy S23']")
	WebElement clicksamsungS23;
	
	public ShopProductByDept1_SamsungGalaxyS23SeriesPage(WebDriver driver) {       //constructor
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public ShopProductByDept2_SamsungGalaxyS23Page clickSamsungGalxyS23() {     //clickS23
		click(clicksamsungS23);
		return new ShopProductByDept2_SamsungGalaxyS23Page(driver);
	}
}
