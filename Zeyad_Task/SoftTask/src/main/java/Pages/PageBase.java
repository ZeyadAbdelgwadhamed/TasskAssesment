package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageBase {
    WebDriver driver;
    public PageBase(WebDriver driver) {
        this.driver = driver;
    }
    public void SendFieldData(WebElement element,String string)
    {
        element.sendKeys(string);
    }
    public void ClickOnElements(WebElement element)
    {
        element.click();
    }

}
