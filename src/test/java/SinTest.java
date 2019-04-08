package test.java;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.epam.tat.module4.Calculator;

public class SinTest {
	
Calculator testCalc = new Calculator();
	
    @Test (testName = "sin test")
    
    @Parameters({"x", "res"})
    public void cosTest(double x, double res) {
    	Assert.assertEquals(testCalc.sin(x), res);
    }
    
  
}