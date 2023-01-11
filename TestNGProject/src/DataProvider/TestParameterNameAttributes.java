package DataProvider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterNameAttributes {

	@Test(dataProvider="Division")
	public void testDiv(int actual, int expected) {
		int result= actual/10;
		
		Assert.assertEquals(result, expected);
		
	}
	
	@DataProvider(name="Division")
	public Object[][] Div(){
		return new Object[][] {{40 ,4},{50, 5}, {110,11}
	};
	
	
	
		
}
}