package test.java;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.epam.tat.module4.Calculator;

public class SumTest {
	
Calculator testCalc = new Calculator();
	
//    @Test (testName = "sum double test")
//    @Parameters({"x","y", "res"})
//    public void cosTest(double x, double y, double res) {
//    	Assert.assertEquals(testCalc.sum(x, y), res);
//    }
    
    @Test
    public void cosTest() {
    	
    	Assert.assertEquals(testCalc.sum(1, 3), 10);
    }
    
    
  
}