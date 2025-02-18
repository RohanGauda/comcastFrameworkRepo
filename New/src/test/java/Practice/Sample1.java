package Practice;

import org.testng.annotations.Test;

import com.comcast.crm.baseclass.BaseClassUtility;

public class Sample1 extends BaseClassUtility{
	
	@Test(invocationCount = 10)
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test(dependsOnMethods = "test1")
	public void test2(){
		System.out.println("Test 2");
	}

}
