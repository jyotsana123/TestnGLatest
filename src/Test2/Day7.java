package Test2;

import org.testng.annotations.Test;

public class Day7 {
    //dependsOnMethods is helper attribute
	//Use dependsOnMethods to create a sample test method that depends on another test method of the same class
	@Test(dependsOnMethods= {"getOrganization"}) 
	public void getEmployeeId()
	{
		System.out.println("Employee id is 1818");
	}
	
	@Test
	public void getOrganization()
	{
		System.out.println("Organization is Vinove");
	}
}
