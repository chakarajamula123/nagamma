package DDFWDemo1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo3 
{
	@Test(dataProvider="setData")
	public void funA(int a, int b)
	{
		System.out.println("funA of DataProviderDemo1");
		System.out.println(a);
		System.out.println(b);
		

	}
	
	@DataProvider
	public Object[][] setData()
	{
		Object[][] obj= new Object[3][2];
		obj[0][1]=10;
		obj[0][1]=20;
		obj[1][0]=30;
		obj[1][1]=40;
		obj[2][0]=50;
		obj[2][1]=60;
		
		return obj;
	}
}



