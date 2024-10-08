import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends AbstractPage {
    public MainPage(WebDriver driver){
        super(driver);

    }
    @FindBy(xpath =" //*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/div/div/ul/li[1]/a")
    private WebElement newFaces;

    public MainPage clicknewfaces() {
        newFaces.click();
        return this;
    }

    @FindBy(xpath = "//a[contains(@class,'categories__link')][contains(text(),'осеньвкармане')]")
    private WebElement autumnInYourPocket;

    public MainPage clickAutumnInYourPocket() {
        autumnInYourPocket.click();
        return this;
    }
    @FindBy(xpath = "//a[contains(@class,'categories__link')][contains(text(),'Медиа')]")
    private WebElement media;
    public MainPage clickmedia(){
        media.click();
        return this;
    }
    

    @FindBy(xpath = "//a[contains(@class,'categories__link')][contains(text(),'Коротко')]")
    private WebElement shortly;
    public MainPage clickshortly() {
        shortly.click();
        return this;
    }
    @FindBy(xpath = "//a[contains(@class,'categories__link')][contains(text(),'Лаборатория ЖЖ')]")
    private WebElement laboratotyGG;
    public MainPage clicklaboratoryGG(){
        laboratotyGG.click();
        return this;
    }
    @FindBy(xpath = "//a[contains(@class,'categories__link')][contains(text(),'ИИ')]")
    private WebElement artificialIntelligence;
    public MainPage clickartificialIntelligence() {
        artificialIntelligence.click();
        return this;
    }
    @FindBy(xpath = "//a[contains(@class,'categories__link')][contains(text(),'Видео')]")
    private WebElement video;
    public MainPage clickvideo() {
        video.click();
        return this;
    }
    @FindBy(xpath = "//a[contains(@class,'categories__link')][contains(text(),'Еда')]")
    private WebElement food;
    public MainPage clickfood() {
        food.click();
        return this;
    }
    @FindBy(xpath = "//a[contains(@class,'categories__link')][contains(text(),'Кино')]")
    private WebElement cinema;
    public MainPage clickcinema() {
        cinema.click();
        return this;
    }
    @FindBy(xpath = "//a[contains(@class,'categories__link')][contains(text(),'здоровье')]")
    private WebElement health;
    public MainPage clickhealth() {
        health.click();
        return this;
    }
    @FindBy(xpath = "//a[contains(@class,'categories__link')][contains(text(),'дети')]")
    private WebElement children;
    public MainPage clickChildren(){
        children.click();
        return this;
    }
    @FindBy(xpath = "//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/div/div/ul/li[12]/a")
    private WebElement  more;
    public MainPage clickmore() {
        more.click();
        return this;
    }

}

