package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "ВОЙТИ")
    private WebElement LoginLink;

public void ClickToLoginLink(){
    LoginLink.click();

}
    @FindBy(xpath = "//*[@id=\"user\"]")
    private WebElement UserNameInput;


    @FindBy(xpath = "//*[@id=\"lj_loginwidget_password\"]")
    private WebElement PasswordInput;

    @FindBy(name = "action:login")
    private WebElement loginBtn;
public void Login(String username,String password){
    UserNameInput.sendKeys(username);
    PasswordInput.sendKeys(password);
    loginBtn.click();

}
    @FindBy(xpath = "//*[@id=\"js\"]/body/div[2]/header/div/nav[2]/ul/li[2]/a/span")
    private WebElement accauntName;
public void accauntNameClick(){
    accauntName.click();


}











}
