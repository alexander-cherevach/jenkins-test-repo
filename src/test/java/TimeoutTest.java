package test.java;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.epam.tat.module4.Timeout;

public class TimeoutTest {
    Timeout testTimeout = new Timeout();

    @Test (timeOut=2000)
    public void testTime() throws InterruptedException {
        testTimeout.sleep(1);
        System.out.println("The value is 1");
    }


}