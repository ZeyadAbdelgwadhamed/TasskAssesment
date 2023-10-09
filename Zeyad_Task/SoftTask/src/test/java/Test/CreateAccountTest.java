package Test;

import Pages.CreateAccount;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends BaseTestPage{
    HomePage homePage;
    CreateAccount createAccount;

    @Test(dataProvider = "AccountDataTest", dataProviderClass = DataDrivenTest.class)
    public void UserCanMakeAccount(String FName,String LName,String Email,String Pass,String ConPass) throws InterruptedException {
        homePage=new HomePage(driver);
        createAccount=new CreateAccount(driver);
        homePage.OpenACountPageButton();
        createAccount.UserCanMakeACount(FName,LName,Email,Pass,ConPass);
        Assert.assertNotNull(createAccount.getFirstName());
        Assert.assertNotNull(createAccount.getLastName());
        Assert.assertNotNull(createAccount.getEmail());
        Assert.assertNotNull(createAccount.getPassword());
        Assert.assertNotNull(createAccount.getConfirmPassword());

    }
}
