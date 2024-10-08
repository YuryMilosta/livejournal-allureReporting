import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.WebDriverListener;

import java.util.concurrent.TimeUnit;

public abstract class AbstractTest {

    public static WebDriver driver;

    @BeforeAll
    static void init() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start miximized");
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


        //driver.navigate().to("https://livejournal.com/");

       /* WebElement webElement1;
        webElement1 = driver.findElement(By.linkText("ВОЙТИ"));
        webElement1.click();
        WebElement webElement2;
        webElement2 = driver.findElement(By.xpath("//*[@id=\"user\"]"));
        webElement2.sendKeys("yurymilosta");
        WebElement webElement3;
        webElement3 = driver.findElement(By.xpath("//*[@id=\"lj_loginwidget_password\"]"));
        webElement3.sendKeys("milista770063A");
        WebElement webElement4;
        webElement4 = driver.findElement(By.name("action:login"));
        webElement4.click();*/
    }

    @BeforeEach
    void goTo() {
        Assertions.assertDoesNotThrow(() -> driver.navigate().to("https://livejournal.com/"), "site is open");
        Assertions.assertTrue(true);
    }

    public static WebDriver getDriver() {
        return driver;


    }
}



