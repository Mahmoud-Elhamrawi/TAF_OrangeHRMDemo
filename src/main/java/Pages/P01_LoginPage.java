package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P01_LoginPage extends pageBase{
    public P01_LoginPage(WebDriver driver) {
        super(driver);
    }


    private final By userNameInp  = By.cssSelector("input[name=\"username\"]");
    private final By passwordInp = By.cssSelector("input[name=\"password\"]") ;
    private final By btnSubmit = By.cssSelector("button[type=\"submit\"]") ;
    private final By logoImgToAssert = By.cssSelector("div[class=\"oxd-brand-banner\"]") ;
    private final By UlListAdmin = By.cssSelector("ul[class=\"oxd-main-menu\"]");
    private final By liListAdmin = By.cssSelector("li[class=\"oxd-main-menu-item-wrapper\"]") ;

    public void fillLoginForm(String name , String password)
    {
        enterTxt(driver.findElement(userNameInp),name );
        enterTxt(driver.findElement(passwordInp),password );
        clickELe(driver.findElement(btnSubmit));
    }
    public  WebElement logImgAssert()
    {
      return   driver.findElement(logoImgToAssert) ;
    }
    public List<WebElement> listOfAdmin()
    {
        return driver.findElements(liListAdmin);
    }









}
