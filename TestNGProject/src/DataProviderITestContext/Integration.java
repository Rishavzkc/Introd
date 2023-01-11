package DataProviderITestContext;

import org.testng.annotations.Test;

public class Integration {

	@Test(dataProvider="TestCase", dataProviderClass=DataproviderSource.class)
	public void integrationtest(String data) {
		System.out.println("Integration: "+data);
	}
}
