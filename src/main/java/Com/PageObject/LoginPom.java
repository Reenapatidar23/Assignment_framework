package Com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	
	//Encapsulation =Data Hiding+ Abstraction
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement Email;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement Password;
	
	@FindBy(how=How.XPATH,using="//button[@id='loginbutton']")
	private WebElement Btn;

	
	//Constructor
	public LoginPom(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getBtn() {
		return Btn;
	}

	
}
