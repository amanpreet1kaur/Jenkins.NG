import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion_class {

	@Test
//	public void verifyTitlewithHardAssertion() {
//		String expTitle="Facebook Title";
//		String act="Facebook ";
//		Assert.assertEquals(act, expTitle);
//		System.out.println("end");
//		
//	}
	public void verifyTitleSoftAssertion() {
		SoftAssert sa=new SoftAssert();
		String expTitle="Facebook Title";
		String act="Facebook Title";
		sa.assertEquals(act, expTitle);
		System.out.println("end");
		sa.assertAll();// to get accurate result
	}
}
