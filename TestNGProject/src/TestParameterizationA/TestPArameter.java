package TestParameterizationA;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestPArameter {

	@Test
	@Parameters("browser")
	public void testone(String browser) {
		System.out.println("Test one working: " +browser);
	}
	
	@Test
	@Parameters({"username","password"})
	public void testwo(String username, String password) {
		System.out.println("Test two username: "+username );
		System.out.println("Test two password: "+password);
	}
}
