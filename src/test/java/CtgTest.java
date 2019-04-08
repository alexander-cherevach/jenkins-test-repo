package test.java;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.epam.tat.module4.Calculator;

public class CtgTest {
	Calculator testCalc = new Calculator();
	
    @Test (testName = "ctg test")
    
    @Parameters({"x", "res"})
    public void ctgTest(double x, double res) {
    	Assert.assertEquals(testCalc.ctg(x), res);
    }
    
  
}