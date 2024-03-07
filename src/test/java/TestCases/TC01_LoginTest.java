package TestCases;

import Pages.P01_LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC01_LoginTest extends testBase{

    P01_LoginPage loginPage ;
    WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(30));
     @Test
    public void validLogin()
    {
      loginPage = new P01_LoginPage(driver);
      loginPage.fillLoginForm("Admin", "admin123");
      wait.until(ExpectedConditions.visibilityOf(loginPage.logImgAssert())) ;
      Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index" ,driver.getCurrentUrl());

    }






}
