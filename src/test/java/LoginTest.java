import io.qameta.allure.*;
import org.example.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v121.page.Page;

import static org.junit.jupiter.api.Assertions.*;

public class LoginTest extends AbstractTest {
    public LoginPage page;

    public void BeforeMethod() {
        LoginPage page = new LoginPage(driver);

    }


    @Story("пользовательская история")
    @Test
    @Epic("стандартный тест")



    @DisplayName("Positiv Test")
    @Description("Проверка авторизации с введением валидных значений")
    @Issue("https://team-mdww.testit.software/projects/1/tests/42")
    @TmsLink("")

    @Severity(SeverityLevel.MINOR)

    @Step("1") public void LoginWithValidUser() throws InterruptedException {
        Thread.sleep(2000);
        LoginPage page = new LoginPage(driver);
        Thread.sleep(2000);
        page.ClickToLoginLink();
        Thread.sleep(2000);
        page.Login("yurymilosta", "milista770063A");
        Thread.sleep(3000);
        page.accauntNameClick();
Assertions.assertEquals("https://yurymilosta.livejournal.com/",driver.getCurrentUrl());

}
    @Test

    @DisplayName("Negativ Test")
    @Description("Проверка авторизации с введением невалидных значений")
    @Issue("https://team-mdww.testit.software/projects/1/tests/43")
    @TmsLink("")
    @Severity(SeverityLevel.BLOCKER)
    public void LoginWithInvalidUser() throws InterruptedException {
        LoginPage page = new LoginPage(driver);
        page.ClickToLoginLink();
        page.Login("yurymilosta", "milista770063b");

        page.accauntNameClick();
        Assertions.assertEquals("https://yurymilosta.livejournal.com/",driver.getCurrentUrl());
    }
}

