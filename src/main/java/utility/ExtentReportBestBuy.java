package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportBestBuy  {

	public static ExtentReports getReport() {
		
		ExtentSparkReporter reporter = new ExtentSparkReporter("./reports/report.html");
		reporter.config().setReportName("BestBuyReport");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		return extent;
		
	}
}
