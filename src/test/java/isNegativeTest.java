package test.java;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.epam.tat.module4.Calculator;

public class isNegativeTest {
	
Calculator testCalc = new Calculator();
	
    @Test (testName = "isNegative test")
    
    @Parameters({"x","res"})
    public void divTest(long x, boolean res) {
    	Assert.assertEquals(testCalc.isNegative(x), res);
    }
    
  
}