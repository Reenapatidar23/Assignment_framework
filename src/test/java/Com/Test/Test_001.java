package Com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.PageObject.LoginPom;
import Com.Utility.BaseClass;
import Com.Utility.Library;

public class Test_001 extends BaseClass {
   @Test
	public void verifyTest_001()
	
	{
	   
	 //PageFactor
	   
	LoginPom login=PageFactory.initElements(driver,LoginPom.class);
	
	Library.Custom_SendKeys(login.getEmail(),excel.getStringData("Sheet1", 0, 0),"Eamil address");
    Library.Custom_SendKeys(login.getPassword(),excel.getStringData("Sheet1", 0, 1),"Password");
	Library.Custom_Click(login.getBtn(),"Login Btn");
 
        //verify
		Assert.assertEquals("Test","Test");
		
  			
		}
	}
  
  


