package myTest;

import baseTest.Base;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTest extends Base  {

    @Test(dataProvider = "browser")
    public void loginPageTitleTest(String browser){
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }
}
