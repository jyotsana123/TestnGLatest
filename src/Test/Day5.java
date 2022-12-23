package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day5 {

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("I will execute before method");
	}
	@Test(groups= {"smoke"})
	public void sectionK()
	{
		System.out.println("Hi I am K");
	}
	
	@Test
	public void sectionL()
	{
		System.out.println("Hi I am L");
	}
	
	@Test
	public void sectionM()
	{
		System.out.println("Hi I am M");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("I will execute before suite");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("I will execute after method");
	}
}
