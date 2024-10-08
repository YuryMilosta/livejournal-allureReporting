import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.time.Duration;

/*public abstract class AbstractTest2 {
    static EventFiringWebDriver eventDriver;
    @BeforeAll
    static void setDriver(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start -maximized");
        options.setPageLoadTimeout(Duration.ofSeconds(10 ));
        eventDriver=new EventFiringWebDriver(new ChromeDriver(options));
        eventDriver.register(new MyWebDriverEventListener());
        eventDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @BeforeEach
    void initMainPage(){
        Assertions.assertDoesNotThrow(()->eventDriver.navigate().to("https://www.livejournal.com/"),"site open");
        Assertions.assertTrue(true);
    }
    @AfterAll
    public static void exit(){
        if(eventDriver!=null)eventDriver.quit();
    }
    

public WebDriver getWebDriver(){
        return this.eventDriver;
}
}
*/