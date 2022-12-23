package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2 {

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("I will execute before class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("I will execute after class");
	}
	
	@Parameters({"URL"})
	@Test
	public void sectionD(String urlname)
	{
		System.out.println("Hi I am D");
		System.out.println(urlname);
	}
	
	@Test(groups= {"smoke"})
	public void sectionE()
	{
		System.out.println("Hi I am E");
	}
	
	@Test
	public void sectionF()
	{
		System.out.println("Hi I am F");
	}
}
