package Test2;

import org.testng.annotations.Test;

public class Day6 {

	//timeOut is helper attribute, If any test case taking long time to execute and because of that it's failed to execute in this case we use timeout helper attribute
	@Test(timeOut=4000)  //this test will wait for 40 sec. to execute
	public void getFirstName()
	{
		System.out.println("First Name is Jyotsana");
	}
	
	@Test(enabled = false) //enabled is helper attribute, we use enabled if we want to skip particular method to execute suppose there is some bug or anything in that method and we don't want to execute that.
	public void getLastName()
	{
		System.out.println("Last Name is Pandey");
	}
}
