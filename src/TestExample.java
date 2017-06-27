import org.testng.annotations.*;

import static org.testng.Assert.*;
import java.util.Random;

public class TestExample {
	
	Random generator = new Random();
	
	@BeforeTest
	public int a(){
		
		int num = generator.nextInt(100);
		return num;
	}
	
	@BeforeMethod
	public void before(){
		System.out.println("@BeforeMethod");
	}

	@AfterMethod
	public void after(){
		System.out.println("@AfterMethod");
	}
	
	@Test (groups = "1", enabled = false)
	public void test_1()
	{
		int b = generator.nextInt(100);
		System.out.println("hlkjsahdlkashflklkasf");
		assertTrue(a()>b, String.format("Error, because %s not bigger then %s \n", a(), b));
		
	}
	
	@Test (groups = "1", threadPoolSize = 5, invocationCount = 7, invocationTimeOut = 10000)
	public void test_2()
	{
		int b = generator.nextInt(100);
		System.out.println("pool test");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(a()>b, String.format("Error, because %s not bigger then %s \n", a(), b));
	}
	
	@Test (groups = "1")
	public void test_3()
	{
		int b = generator.nextInt(100);
		assertTrue(a()>b, String.format("Error, because %s not bigger then %s \n", a(), b));
	}
	
	@Test (groups = "1")
	public void test_4()
	{
		int b = generator.nextInt(100);
		assertTrue(a()>b, String.format("Error, because %s not bigger then %s \n", a(), b));
	}
	
	@Test
	public void test_5()
	{
		int b = generator.nextInt(100);
		assertTrue(a()>b, String.format("Error, because %s not bigger then %s \n", a(), b));
	}
	
	@Test
	public void test_6()
	{
		int b = generator.nextInt(100);
		assertTrue(a()>b, String.format("Error, because %s not bigger then %s \n", a(), b));
	}
	
	@Test
	@Parameters({ "value" })
    public void test_7(int value)
	{
		int b = generator.nextInt(value);
		assertTrue(a()>b, String.format("Error, because %s not bigger then %s \n", a(), b));
	}
	
	@Test
	public void test_8()
	{
		int b = generator.nextInt(100);
		assertTrue(a()>b, String.format("Error, because %s not bigger then %s \n", a(), b));
	}
	
	@Test
	public void test_9()
	{
		int b = generator.nextInt(100);
		assertTrue(a()>b, String.format("Error, because %s not bigger then %s \n", a(), b));
	}
	
	@Test
	public void test_10()
	{
		int b = generator.nextInt(100);
		assertTrue(a()>b, String.format("Error, because %s not bigger then %s \n", a(), b));
	}
	
	@AfterTest
	public void log()
	{
		System.out.print("All the tests are finnished \n");
	}
	

}