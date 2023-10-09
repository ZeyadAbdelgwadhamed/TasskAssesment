package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccount extends PageBase{
    public CreateAccount(WebDriver driver) {
        super(driver);
    }
    private WebElement FirstName;
    private WebElement LastName;
    private WebElement Email;
    private WebElement Password;
    private WebElement ConfirmPassword;
    private  WebElement SubmitElement;

    public WebElement getFirstName() {
        return driver.findElement(By.id("firstname"));
    }

    public WebElement getLastName() {
        return driver.findElement(By.id("lastname"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("email_address"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getConfirmPassword() {
        return driver.findElement(By.id("password-confirmation"));
    }
    public WebElement getSubmitElement()
    {
        return driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button"));
    }
    public void UserCanMakeACount(String FName,String LName,String Email,String Pass,String ConPass)
    {
        SendFieldData(getFirstName(),FName);
        SendFieldData(getLastName(),LName);
        SendFieldData(getEmail(),Email);
        SendFieldData(getPassword(),Pass);
        SendFieldData(getConfirmPassword(),ConPass);
        ClickOnElements(getSubmitElement());
    }





}
