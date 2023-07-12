package Runner_Script;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import Generic.Base_Test;
import Generic.Fetch_Data;
import Pom_Script.Pom1;


public class Test_Script extends Base_Test
{    // welcome 
	@Test
	public void testcase6() throws InterruptedException 
	{		
	  String value = Fetch_Data.get_data("Sheet1",  0 , 0);
	  System.out.println(value);
	  String value1 = Fetch_Data.get_data("Sheet1",  0 , 1);
	  System.out.println(value1);
	  String value2 = Fetch_Data.get_data("Sheet1",  1 , 0);
	  System.out.println(value2);
	  String value3 = Fetch_Data.get_data("Sheet1",  1 , 1);
	  System.out.println(value3);
	  String value4 = Fetch_Data.get_data("Sheet1",  2 , 0);
	  System.out.println(value4);
	  String value5 = Fetch_Data.get_data("Sheet1",  2 , 1);
	  System.out.println(value5);
	  String value6 =Fetch_Data.get_data("Sheet1",  3 , 0);
	  System.out.println(value6);
	  String value7 = Fetch_Data.get_data("Sheet1",  3 , 1);
	  System.out.println(value7);
	  String value8 = Fetch_Data.get_data("Sheet1",  4 , 0);
	  System.out.println(value8);
	  String value9 = Fetch_Data.get_data("Sheet1",  4 , 1);
	  System.out.println(value9);
	  String value10=Fetch_Data.get_data("Sheet1",  5 , 0);
	  System.out.println(value10);
	  String value11 = Fetch_Data.get_data("Sheet1",  5 , 1);
	  System.out.println(value11);
		Pom1 p = new Pom1(driver);
		p.Email(value);
		Thread.sleep(2000);
		p.Password(value1);
		Thread.sleep(2000);
		p.Login();
		Thread.sleep(3000);
		Assert.fail();
	}
}

		//Assert.fail();
		
		
		
	
	/*@DataProvider(name = "testdata")
	public Object[][] createData1()
	{
	return new Object[][]
			{
		{"jyoti@gmail.com","123456"},
		{"sharan@gmail.com","123456"},
		
	};*/
// test script completed successfully.


