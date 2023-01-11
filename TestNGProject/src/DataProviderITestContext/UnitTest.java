package DataProviderITestContext;

import org.testng.annotations.Test;

public class UnitTest {
	@Test(dataProvider="TestCase", dataProviderClass=DataproviderSource.class)
	public void unittest(String data) {
		System.out.println("Unit: "+data);
	}
}
