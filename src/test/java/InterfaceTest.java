import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InterfaceTest extends AbstractTest{
@Disabled

    public void MainTabsTest(){
        WebElement newFaces;
        newFaces=driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/div/div/ul/li[1]/a"));
        newFaces.click();
        WebElement media;
        media=driver.findElement(By.cssSelector("body > div.s-layout.body-content.s-logged-in > div.s-body > div.mainpage.mainpage--cat-page.mainpage--adv.ng-scope.mainpage--cat-full > div.categories > div > div > ul > li:nth-child(2) > a"));
        media.click();
        WebElement summerDays;
        summerDays=driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/div/div/ul/li[3]/a"));
        summerDays.click();
        WebElement summerOnTable;
        summerOnTable=driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/div/div/ul/li[4]/a"));
        summerOnTable.click();
        WebElement shortly;
        shortly=driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/div/div/ul/li[5]/a"));
        shortly.click();
        WebElement laboratotyGG;
        laboratotyGG=driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/div/div/ul/li[6]/a"));
        laboratotyGG.click();
        WebElement artificialIntelligence;
        artificialIntelligence=driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/div/div/ul/li[7]/a"));
        artificialIntelligence.click();
        WebElement video;
        video=driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/div/div/ul/li[8]/a"));
        video.click();
        WebElement food;
        food=driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/div/div/ul/li[9]/a"));
        food.click();
        WebElement cinema;
        cinema=driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/div/div/ul/li[10]/a"));
        cinema.click();
        WebElement health;
        health=driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/div/div/ul/li[11]/a"));
        health.click();
        WebElement more;
        more=driver.findElement(By.cssSelector("body > div.s-layout.body-content.s-logged-in > div.s-body > div.mainpage.mainpage--cat-page.mainpage--adv.ng-scope.mainpage--cat-mix > div.categories > div > div > ul > li:nth-child(12) > a"));
        more.click();
    }


}
