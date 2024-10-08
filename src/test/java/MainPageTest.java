import org.example.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageTest extends AbstractTest{
    public LoginPage page;

        @Test
    void MainPagePisitivTest()throws InterruptedException{
        LoginPage page = new LoginPage(driver);
        page.ClickToLoginLink();
        Thread.sleep(5000);
        page.Login("yurymilosta", "milista770063A");


            MainPage mainPage = new MainPage(driver);
            mainPage
                 .clicknewfaces()
                .clickmedia()
                    .clickAutumnInYourPocket()
                    .clickshortly()
                .clicklaboratoryGG()
                .clickartificialIntelligence()
                .clickvideo()
                .clickfood()
                .clickcinema()
                .clickhealth()

                    .clickChildren()

                .clickmore();
        Assertions.assertEquals("https://www.livejournal.com/category/all/",driver.getCurrentUrl());
    }
}




