package DataProviderITestContext;

import org.testng.annotations.Test;

public class DataProviderExm {

	@Test(dataProvider ="Scene", dataProviderClass=DataproviderSource.class)
	public void Scene1(String SData) {
		System.out.println("Scene1: "+ SData);
	}
	
	@Test(dataProvider ="Scene", dataProviderClass=DataproviderSource.class)
	public void Scene2(String SData) {
		System.out.println("Scene2: "+ SData);
	}
	
	@Test(dataProvider ="Scene", dataProviderClass=DataproviderSource.class)
	public void Common(String SData) {
		System.out.println("Common: "+ SData);
	}
	
	
}
