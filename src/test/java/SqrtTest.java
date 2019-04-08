package test.java;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class SqrtTest {
	
Calculator testCalc = new Calculator();
	
    @Test (testName = "sqrt test")
    
    @Parameters({"x", "res"})
    public void sqrtTest(double x, double res) {
    	Assert.assertEquals(testCalc.sqrt(x), res);
    }
    
  
}