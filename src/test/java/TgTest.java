package test.java;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.epam.tat.module4.Calculator;

public class TgTest {
Calculator testCalc = new Calculator();
	
    @Test (testName = "tg test")
    
    @Parameters({"x", "res"})
    public void tgTest(double x, double res) {
    	Assert.assertEquals(testCalc.tg(x), res);
    }
    
  
}