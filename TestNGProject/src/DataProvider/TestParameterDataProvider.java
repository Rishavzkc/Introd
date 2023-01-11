package DataProvider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterDataProvider {

	@Test(dataProvider="data")
	public void AdditionTest(int actual, int expected) {
		int result =actual +20;
		Assert.assertEquals(result, expected);
	}
	
	@DataProvider
	public Object [][] data() {
		return new Object[][] { {100, 120}, {200, 220}, {30,50},{50,90}};
			
	}
	
}
