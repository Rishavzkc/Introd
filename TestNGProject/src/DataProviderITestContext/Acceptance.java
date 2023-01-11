package DataProviderITestContext;

import org.testng.annotations.Test;

public class Acceptance {

	
	@Test(dataProvider="TestCase", dataProviderClass=DataproviderSource.class)
	public void acceptancetest(String data) {
		System.out.println("Acceptance: "+ data );
	}
}
