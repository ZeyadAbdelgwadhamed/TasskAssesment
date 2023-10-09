package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn extends PageBase{
    public SignIn(WebDriver driver) {
        super(driver);
    }
    private WebElement EmailText;
    private WebElement PasswordText;
    private WebElement SingInElement;

    public WebElement getEmailText() {
        return driver.findElement(By.xpath("//input[@id='email']"));
    }

    public WebElement getPasswordText() {
        return driver.findElement(By.xpath("//input[@id='pass']"));
    }

    public WebElement getSingInElement() {
        return driver.findElement(By.xpath("//span[contains(text(),'Sign In')]"));
    }

    public void LoginForm(String Email,String Pass)
    {
        SendFieldData(getEmailText(),Email);
        SendFieldData(getPasswordText(),Pass);
        ClickOnElements(getSingInElement());
    }

}
