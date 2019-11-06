

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupingDemo {
	@BeforeGroups("Sanity")
	public void beforeGrp() {
		System.out.println("before groups");
	}
	@Test(groups="Smoke")
	public void aTestCase() {
		System.out.println("smoke = a test case");
	}
	@Test(groups="Sanity")
	public void bTestCase() {
		System.out.println("sanity = a test case");
	}
	@Test(groups="Regression")
	public void cTestCase() {
		System.out.println("Regression = a test case");
		
	}
	@Test(groups="Regression,Sanity")
	public void dTestCase() {
		System.out.println("And case  = a test case");
	}
	@Test(groups= {"Sanity","Smoke"})
	public void eTestCase() {
		System.out.println("Or case  = a test case");
	}
		
	
	@Test(priority =1)
	public void TestCase() {
		System.out.println("testcase");
	}
	
	public static void main(String[] args) {
		

	}

}
