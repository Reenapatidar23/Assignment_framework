package Com.Utility;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	public static ExtentTest test;
	public static void Custom_SendKeys(WebElement element,String value,String fieldname) {
	   try{
		if(element.isEnabled()==true) {
		element.sendKeys(value);
		test.log(Status.PASS, fieldname +"=value sucessful send="+value);
		}
	    }catch (Exception e) {
			test.log(Status.FAIL, e.getMessage());	
       
     }
	
    }
	public static void Custom_Click(WebElement element,String fieldname)
	{
		test.log(Status.PASS, "Clicked Succefully="+fieldname);

   try {
	      element.click();
	      
     } catch (Exception e) {
    	 test.log(Status.FAIL, e.getMessage());		}

    }
	public static void Custom_handleDropown(WebElement element,String test)
	{
		try {
			Select sc=new Select(element);
	        sc.selectByVisibleText(test);
		}catch (Exception e) {
		
		System.out.println(e.getMessage());
		}


}
	}
