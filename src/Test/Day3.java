package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Day3 {
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("I will execute after suite");
	}

	@Test
	public void sectionG()
	{
		System.out.println("Hi I am G");
	}
	
	@Test
	public void sectionH()
	{
		System.out.println("Hi I am H");
	}
	
	@Test
	public void sectionI()
	{
		System.out.println("Hi I am I");
	}
}
