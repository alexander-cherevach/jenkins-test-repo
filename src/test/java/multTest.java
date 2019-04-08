package test.java;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class multTest {
	
Calculator testCalc = new Calculator();
	
    @Test (testName = "mult test")
    
    @Parameters({"x","y", "res"})
    public void divTest(double x, double y, double res) {
    	Assert.assertEquals(testCalc.mult(x, y), res);
    }
    
  
}

