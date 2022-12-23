package Test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {

	@AfterTest
	public void executeLast()
	{
		System.out.println("I will execute after test");
	}
	
	@Test(groups= {"smoke"})
	public void sectionA()
	{
		System.out.println("Hi I am A");
		Assert.assertTrue(false);
	}
	
	@Test
	public void sectionB()
	{
		System.out.println("Hi I am B");
	}
	
	@Test
	public void sectionC()
	{
		System.out.println("Hi I am C");
	}
	
	@BeforeTest
	public void executeFirst()
	{
		System.out.println("I will execute before test");
	}
}
