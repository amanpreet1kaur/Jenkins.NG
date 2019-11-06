import org.testng.annotations.Test;

public class prioritize_class {

	@Test
	public void dtestcase()
	{
		System.out.println("dtestcase 1");
		
	}
	@Test(priority=1)
	public void etestcase()
	{
		System.out.println("dtestcase 2");
		
	}
	@Test(priority=2)
	public void atestcase()
	{
		System.out.println("dtestcase 3");
		
	}

	}


