import org.testng.annotations.Test;

public class prioritize_class2 {

	@Test
	public void dtestcase()
	{
		System.out.println("dtestcase 3");
		
	}
	@Test(priority=1)
	public void etestcase()
	{
		System.out.println("dtestcase 4");
		
	}
	@Test(priority=2)
	public void atestcase()
	{
		System.out.println("dtestcase 5");
		
	}

	}


