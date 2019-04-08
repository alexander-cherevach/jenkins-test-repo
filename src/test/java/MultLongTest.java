package test.java;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class MultLongTest {
Calculator testCalc = new Calculator();
	
    @Test (testName = "mult long test")
    
    @Parameters({"x","y", "res"})
    public void divTest(long x, long y, long res) {
    	Assert.assertEquals(testCalc.mult(x, y), res);
    }
    
  
}

