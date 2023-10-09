package Test;

import Pages.HomePage;
import Pages.SignIn;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SignInTest extends BaseTestPage{
    HomePage homePage;
    SignIn signIn;
    SoftAssert softAssert;

    @Test(dataProvider ="SignINDataTest",dataProviderClass = DataDrivenTest.class)
    public void UserCanLogin(String Email,String Pass)
    {
        homePage=new HomePage(driver);
        signIn=new SignIn(driver);
        softAssert=new SoftAssert();
        homePage.OpenSingInPageButton();
        signIn.LoginForm(Email,Pass);
        Assert.assertNotNull(signIn.getEmailText()," Assert Email not null");
        Assert.assertNotNull(signIn.getPasswordText()," Assert PassWord not null");
    }
}
