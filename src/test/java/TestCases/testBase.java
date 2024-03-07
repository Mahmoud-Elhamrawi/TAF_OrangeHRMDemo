package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class testBase {
    public WebDriver driver ;

    @BeforeClass
    public void setUp()
    {
       driver = new ChromeDriver() ;

       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }





    @AfterClass
    public void cleanUp()
    {
        driver.quit();
    }
}
