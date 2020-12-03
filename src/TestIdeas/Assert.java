package TestIdeas;

import org.testng.annotations.Test;

public class Assert extends FacebookApp  {
	
	
	@Test
	
	public void CheckText()
	{
		String ExpectedText= "The email address or phone number that you've entered doesn't match any account."
				+ " Sign up for an account.";
		
		aseertEquals();
	}
	
	
	

}
