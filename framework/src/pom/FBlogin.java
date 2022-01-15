package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_page;

public class FBlogin extends Base_page
{
	@FindBy(id="email")
	private WebElement UnTbox;
	
	@FindBy(id="pass")
	private WebElement PwdTbox;
	
	@FindBy(name="login")
	private WebElement loginBtn;
	// declaration
	
	public FBlogin(WebDriver driver)
	{
		super(driver);
	}
	//Initilization
	public void setUsername(String un)
	{
		UnTbox.sendKeys(un);
	}
	public void setPassword(String Pwd)
	{
		PwdTbox.sendKeys(Pwd);
	}
	public void clickLogin()
	{
		loginBtn.click();
	}
	

}
