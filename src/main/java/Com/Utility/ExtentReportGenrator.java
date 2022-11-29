package Com.Utility;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {
	//ExtentsparkReport
  //ExtentReports
	public static ExtentReports extent;
	public static ExtentReports getreports()
	{
	    String path="C:\\Users\\admin\\eclipse-workspace\\Assignment_framework\\Reports";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Assignment report");
		reporter.config().setReportName("Automation Test Report");
		reporter.config().setTheme(Theme.DARK);
		
		 extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Project Name", "Test");
		extent.setSystemInfo("Module Name", "Test Login");
		extent.setSystemInfo("QA", "ABC");
		return extent;

		

		
		
		
		
			
			
		
		
		
		
		
	}
	
	
	
}
