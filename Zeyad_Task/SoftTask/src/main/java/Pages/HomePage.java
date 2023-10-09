package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private WebElement CreateAccountElement;
    private WebElement SingInElement;
    public WebElement getCreateAccountElement() {
        return driver.findElement(By.xpath("//*[contains(text(), 'Create an Account')]"));
    }

    public WebElement getSingInElement() {
        return driver.findElement(By.xpath("//*[contains(text(), 'Sign In ')]"));
    }
    public CreateAccount OpenACountPageButton()
    {
        ClickOnElements(getCreateAccountElement());
        return new CreateAccount(driver);
    }
    public SignIn OpenSingInPageButton()
    {
        ClickOnElements(getSingInElement());
        return new SignIn(driver);
    }




}
