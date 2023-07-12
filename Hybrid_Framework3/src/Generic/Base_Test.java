package Generic;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.internal.annotations.ITest;

public class Base_Test implements Framework_Constant
{
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty(chrome_key,chrome_value);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get(baseURL);
		driver.manage().window().maximize();
		
	}
	@AfterMethod
    public void closeapp(ITestResult res) throws IOException
    {
		if(ITestResult.FAILURE==res.getStatus())
		{
			Generic_Shot.get_photo(driver);
		}
		driver.close();
    }

}
