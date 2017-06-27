import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderTest {
	
	Map<Integer, String> testMap;
	
	@BeforeClass
	public void setup(){
		testMap = new HashMap<Integer, String>();
		testMap.put(1, "Rock concert of the decade");
		testMap.put(2, "Arrhythmia: cvbvbGraffiti");
		testMap.put(3, "Battle of the Brass Bands");
	}

	@DataProvider(name = "dprovider")
    public Object[][] myDataProvider() {
        return new Object[][] { 
        		{ 1, "Rock concert of the decade" }, 
        		{ 2, "Arrhythmia: Graffiti" }, 
        		{ 3, "Battle of the Brass Bands" }
        	};
    }
	
	@Test(dataProvider = "dp")
	public void firstBasicTest(int concertIndex, String expectedResult) throws InterruptedException{
		Assert.assertEquals(expectedResult, testMap.get(concertIndex), "");
	}
}
