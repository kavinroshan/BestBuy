package test;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.CountrySelectionPage;

public class TC006_BottomLinkTest extends ProjectSpecification{

	@Test
	public void BottomLinkTest() throws InterruptedException {
		new CountrySelectionPage(driver)
		.clickCountry1()
		.WaitMethod()
		.BottomLink();
		
	}
}
