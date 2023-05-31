package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    public void openLogin(){
        openAt("/login");
    }
    private By inputEmail(){
        return By.cssSelector("input[name='email']");
    }
    private By inputPassword(){
        return By.cssSelector("input[name='password']");
    }
    private By btnSubmit(){
        return By.cssSelector("button.ladda-button[data-style='expand-right']");
    }
    private By reqEmail(){
        return By.xpath("//span[text()[contains(.,'Email harus diisi.')]]");
    }
    private By reqPassword(){
        return By.xpath("//span[text()[contains(.,'Password harus diisi.')]]");
    }
    private By messageFailed(){
        return By.xpath("//div[@id='root']/div/div/li");
    }
    private By indexDashboard(){
        return By.xpath("//h1[text()[contains(.,'Selamat Datang')]]");
    }
    private By reqPass6char(){
        return By.xpath("//span[@class=\"help-block\"][text()[contains(.,'Password harus di antara 6 dan 30.')]]");
    }

    public void InputEmail(String email){
        $(inputEmail()).type(email);
    }
    public void InputPassword(String password){
        $(inputPassword()).type(password);
    }
    public void ClickBtnSubmit(){
        $(btnSubmit()).click();
    }

    public void ValidReqEmail(){
        $(reqEmail()).isDisplayed();
    }
    public void ValidReqPass(){
        $(reqPassword()).isDisplayed();
    }
    public void MessageFailed(){
        $(messageFailed()).isDisplayed();
    }
    public void ValidReqPass6Char(){
        $(reqPass6char()).isDisplayed();
    }
    public void ValidDashboard(){
        $(indexDashboard()).isDisplayed();
    }

}
