package Com.Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners implements ITestListener{
	ExtentReports extent=ExtentReportGenrator.getreports();
  ThreadLocal<ExtentTest> extenttest=new  ThreadLocal<ExtentTest>();
  
	public void onTestStart(ITestResult result) {
		Library.test=extent.createTest(result.getTestClass().getName()+ "=="+result.getMethod().getMethodName());
		extenttest.set(Library.test);
	}

	public void onTestSuccess(ITestResult result) {
		extenttest.get().log(Status.PASS, "test case pass");
	}

	public void onTestFailure(ITestResult result) {
		extenttest.get().log(Status.PASS, "Test case Fail");

		
	}

	public void onTestSkipped(ITestResult result) {
		extenttest.get().log(Status.PASS, "Test case Skip");
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
	}
	
	
	
	
	
	

}
