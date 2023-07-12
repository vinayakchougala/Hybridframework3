package Pom_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Base_Page;

public class Pom1 extends Base_Page
{
	@FindBy(id="email")
	private WebElement emailtextfield;
	
	@FindBy(id="password")
	private WebElement passwordtextfield;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginbutton;
	
	public Pom1 (WebDriver driver)
	{
		super(driver);
	}
	
	public void Email(String un)
	{
		emailtextfield.sendKeys(un);
	}
	public void Password(String pwd)
	{
		passwordtextfield.sendKeys(pwd);
	}
	public void Login()
	{
		loginbutton.click();
	}
	

}
