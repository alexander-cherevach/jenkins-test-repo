package test.java;

import com.beust.jcommander.Parameters;
import org.testng.Assert;
import org.testng.annotations.*;
import com.epam.tat.module4.Calculator;
import java.lang.*;

public class divTest {
    Calculator testCalc = new Calculator();

    @DataProvider(name = "testData")
        public Object[][] getData() {
        return new Object[][]{
                {4d, 2d, 2d},
                {1d, 1d, 1d}
        };
    }
        @Test(dataProvider = "testData")
            public void divisionTest(double value1, double value2, double result){
                Assert.assertEquals(testCalc.div(value1, value2), result);
            }
            //
        @Test(expectedExceptions = NumberFormatException.class)
            public void testDivideByZero() {
            testCalc.div(10d, 0d);
    }
    }