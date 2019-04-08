package test.java;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.epam.tat.module4.Calculator;

public class PowTest {
Calculator testCalc = new Calculator();
	
    @Test (testName = "pow test")
    
    @Parameters({"x", "y", "res"})
    public void ctgTest(double x, double y, double res) {
    	Assert.assertEquals(testCalc.pow (x,y), res);
    }
    
  
}