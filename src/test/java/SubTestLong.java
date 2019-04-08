package test.java;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.epam.tat.module4.Calculator;

public class SubTestLong {
Calculator testCalc = new Calculator();
	
    @Test (testName = "sub long test")
    
    @Parameters({"x","y", "res"})
    public void cosTest(long x, long y, long res) {
    	Assert.assertEquals(testCalc.sub(x, y), res);
    }
    
  
}