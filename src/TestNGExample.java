import  static org.testng.Assert.*;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGExample {
	
	public int add(int a, int b){
		return a + b;
	}
	
	@Test (groups = "addadd")
	public void testAdd(){
		int expectedResult = 6;
		Reporter.log("asserting add method: ", true);
		int actualresult = add(2, 3);
	    assertEquals(actualresult, expectedResult,
				String.format("Expected result of add method was '%s', but was found '%s'", expectedResult, actualresult));		
	
	}
	
	@Test (groups = {"add", "Remove"} ) 
	public void testAddAdd(){
		int expectedResult = 10;
		Reporter.log("asserting add method: ", true);
		assertEquals(add(2, 3) + add(3, 2), expectedResult);		
	}
	
	@Test ( ) 
	public void testAddAddAdd(){
		int expectedResult = 10;
		Reporter.log("asserting add method: ", true);
		assertEquals(add(2, 3) + add(3, 2), expectedResult);		
	}
	
	
	@Test (groups = "Remove" ) 
	public void testRemove(){
		int expectedResult = 10;
		Reporter.log("asserting add method: ", true);
		assertEquals(add(2, 3) + add(3, 2), expectedResult);		
	}
	
	@Test (groups = "Remove" ) 
	public void testRemoveRemove(){
		int expectedResult = 10;
		Reporter.log("asserting add method: ", true);
		assertEquals(add(2, 3) + add(3, 2), expectedResult);		
	}
	
	@Test ( ) 
	public void testRemoveRemoveRmove(){
		int expectedResult = 10;
		Reporter.log("asserting add method: ", true);
		assertEquals(add(2, 3) + add(3, 2), expectedResult);		
	}
}
