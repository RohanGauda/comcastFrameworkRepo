package Practice;

import org.testng.annotations.Test;

import com.comcast.crm.baseclass.BaseClassUtility;

public class Sample2 extends BaseClassUtility{
	
	@Test(invocationCount = 3)
	public void test3() {
		System.out.println("Test 3");
	}
	
	@Test(dependsOnMethods = "test3")
	public void test4(){
		System.out.println("Test 4");
	}

}
