package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class ShopProductByDept2_SamsungGalaxyS23Page extends ProjectSpecification{
	
	@FindBy(xpath="//button[@aria-label='Save'][1]")
	WebElement save;

	@FindBy(xpath="//button[@class='c-button c-button-primary c-button-lg c-button-block c-button-icon c-button-icon-leading add-to-cart-button']")
	WebElement addtocart;
	
	@FindBy(xpath="//button[contains(text(),'Continue shopping')]")    //continue shopping
	WebElement continueShopping;
	
	@FindBy(xpath="//button[@aria-label='Menu']")
	WebElement clickMenuButton; 
	
	@FindBy(xpath="//button[text()='Brands']")
	WebElement clickBrand;
	

	@FindBy(xpath="//a[text()='LG']")
	WebElement clickLG;
	
	
	public ShopProductByDept2_SamsungGalaxyS23Page(WebDriver driver) {          //constructor
		this.driver = driver; 
		PageFactory.initElements(driver,this);
	}
	
	public ShopProductByDept2_SamsungGalaxyS23Page MoveToSave() {
		Actions action = new Actions(driver);
		action.moveToElement(save).click(save).perform();
		return this;
	}
	
	public ShopProductByDept2_SamsungGalaxyS23Page WaitMethod() throws InterruptedException {
		Wait();
		return this;
	}
	
	public ShopProductByDept2_SamsungGalaxyS23Page ClickAddToCart() throws InterruptedException {         //S23addtocart
		Actions action = new Actions(driver);
		action.moveToElement(addtocart).perform();
		Thread.sleep(3000);
		action.click(addtocart).perform();
		//System.out.println("Clicked Add to cart");
		return this;
	}
	
	public ShopProductByDept2_SamsungGalaxyS23Page ClickContinueShopping() throws InterruptedException {  //coninueshopping
		Thread.sleep(3000);
		click(continueShopping);
		return this;
	}
	
	public ShopProductByDept2_SamsungGalaxyS23Page ClickMenu() {         //clickmenu
		click(clickMenuButton);
		return this;
	}
	
	public ShopProductByDept2_SamsungGalaxyS23Page ClickBrand() {      //clickBrand
		click(clickBrand);
		return this;
	}
	
	public ShopByBrand1_LGStorePage ClickLG() {        //selectbrand (LG)
		click(clickLG);
		return new ShopByBrand1_LGStorePage(driver);
	}
	
}
