package Test3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day8 {
	
	@Test(dataProvider = "getData")
	public void login(String username, String password)
	{
		System.out.println("Login successfully");
		System.out.println("Username");
		System.out.println("Password");
	}

	@DataProvider
	public Object[][] getData()
	{
		//1st combination - Username, password (to check good credit history in banking website)
		//2nd combination - Username, password (to check no credit history in banking website)
		//3rd combination - Username, password (to check fraudelent credit history in banking website)
		Object[][] data = new Object[3][2];
		
		//1st set
		data[0][0] = "firstusername";
		data[0][1] = "password";
		
		//2nd set
		data[1][0] = "secondusername";
		data[1][1] = "password";
		
		//3rd set
		data[2][0] = "thirdusername";
		data[2][1] = "password";
		
		return data;
		
		//How do you achieve parametrization 
		//2 ways
		//1. drive data from TestNG xml file
		//2. also drive the data and u can parametrize it by @DataProvider annotation
	}
}
