package myTest;

import baseTest.Base;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTest extends Base  {

    @Test
    public void loginPageTitleTest(){
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }
}
