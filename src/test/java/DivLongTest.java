package test.java;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.epam.tat.module4.Calculator;

public class DivLongTest {
    Calculator testCalc = new Calculator();

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        testCalc.div(10L, 0L);
    }
}