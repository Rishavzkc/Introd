package DataProviderITestContext;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

public class DataproviderSource {

	
	@DataProvider(name ="Scene")
	public static Object[][] getSceneData(Method method){
		String test =method.getName();
		
		if("Scene1".equals(test)){
			return new Object[][] {{"Scene1"}};
		}
		else if("Scene2".equals(test)) {
			return new Object[][] {{"Scene2"}};
		}
		else {
			return new Object[][] {{"Common"}};
		}
	}
	
	@DataProvider(name ="TestCase")
	public static Object[][] getTestData(ITestContext context){
		String testcase =context.getName();
		if ("acceptancetest".equals(testcase)) {
			return new Object[][] {{"acceptancetest"}};
		}
		else if ("Integrationtest".equals(testcase)) {
			return new Object[][] {{"integrationtest"}};
		}
		else {
			return new Object[][] {{"Unit test"}};
		}
		
	}
}
