package test.java;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CosTest {
	
Calculator testCalc = new Calculator();
	
    @Test (testName = "cos test")
    
    @Parameters({"x", "res"})
    public void cosTest(double x, double res) {
    	Assert.assertEquals(testCalc.cos(x), res);
    }
}