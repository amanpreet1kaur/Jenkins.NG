import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_annotation 
{
	@Test(enabled=false)
	public void testb()
	{
		System.out.println("Testb");
	}
	
	@Test
	public void testc()
	{
		System.out.println("Testc");
	}
	
	@BeforeClass
	public void befreclass()
	{
		System.out.println("before class");
	}
	
	@BeforeTest
	public void befretest()
	{
		System.out.println("before test");		
	}
	
	@Test
	public void testa()
	{
		System.out.println("Testa");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("ater test");		
	}
	
	@AfterClass
	public void Afterclass()
	{
		System.out.println("after class");
	}
	
	@AfterSuite
	public void Aftersuite()
	{
		System.out.println("After suite");
	}
	
	@BeforeSuite
	public void befresuite()
	{
		System.out.println("before suite");
	}
	
	@BeforeMethod
	public void m3()
	{
		System.out.println("before method");
	}
	
	@AfterMethod
	public void m4()
	{
		System.out.println("after method");
	}
}
