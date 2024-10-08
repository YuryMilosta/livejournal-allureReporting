import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest extends AbstractTest {
    @DisplayName("Positiv Test ")

    @Test
    public void Login() {

        driver.get("https://www.livejournal.com/");
        driver.findElement(By.linkText("ВОЙТИ")).click();
        driver.findElement(By.xpath("//*[@id=\"user\"]")).sendKeys("yurymilosta");
        driver.findElement(By.xpath("//*[@id=\"lj_loginwidget_password\"]")).sendKeys("milista770063A");
        driver.findElement(By.name("action:login")).click();
        Assertions.assertEquals("https://www.livejournal.com/", driver.getCurrentUrl());
    }

    @DisplayName("Negativ Test")
    @Test
    public void noLogin() {

        driver.get("https://www.livejournal.com/");
        driver.findElement(By.linkText("ВОЙТИ")).click();
        driver.findElement(By.xpath("//*[@id=\"user\"]")).sendKeys("yurymilista");
        driver.findElement(By.xpath("//*[@id=\"lj_loginwidget_password\"]")).sendKeys("milista77006eA");
        driver.findElement(By.name("action:login")).click();
        Assertions.assertEquals("https://www.livejournal.com/", driver.getCurrentUrl());
    }
}
