package DDFWDemo1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo1 
{
	@Test(dataProvider="setData")
	public void funA(int a)
	{
		System.out.println("funA of DataProviderDemo1");
		System.out.println(a);

	}
	@DataProvider
	public Object[][] setData()
	{
		Object[][] obj= new Object[3][1];
		obj[0][0]=10;
		obj[1][0]=20;
		obj[2][0]=30;
		

								return obj;
	}
}
