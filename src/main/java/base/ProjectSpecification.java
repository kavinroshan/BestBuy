package base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utility.Utils;


public class ProjectSpecification extends Utils {
	
	  @Parameters({"browser","url"})
	  @BeforeMethod
	  public void browserLaunch(String browser, String url) {
		  
		  launchBrowser(browser, url);
	  }
		
		@DataProvider(name = "getData")
		public String[][] getData() throws IOException {
			
			String[][] data = readExcel(excelfile);
			return data;
		}
	  
	  @AfterMethod   // To close the browser
	  public void closeBrowser() {
		  
		  close();

}
}