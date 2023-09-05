package sampleTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {

    @Test
    public void greet(){
        System.out.println("Hi");
        Assert.assertEquals(2,2);
    }
}
