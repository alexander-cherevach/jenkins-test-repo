package test.java;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.epam.tat.module4.Calculator;

public class SubTest {
Calculator testCalc = new Calculator();
	
    @Test (testName = "sub test")
    
    @Parameters({"x","y", "res"})
    public void cosTest(double x, double y, double res) {
    	Assert.assertEquals(testCalc.sub(x, y), res);
    }
    
  
}