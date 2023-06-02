package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class InventoryPage extends PageObject {
    public void openDashboard(){
        openAt("/home");
    }
    private By clickSideBarItem(){
        return By.xpath("//span[text()='Barang']");
    }
    private By clickSideBarPersediaan(){
        return By.xpath("//a[@href=\"/home/inventory\"]");
    }
    private By clickBoxCheckItem(){
        return By.xpath("(//div[@value='false'])[1]");
    }
    private By clickBoxUncheckItem(){
        return By.xpath("(//div[@value='true'])[1]");
    }
    private By clickBtnPenyesuaianPersediaan(){
        return By.xpath("(//button//span[@class='ladda-label'])[2]");
    }
    private By inputNewQty(){
        return By.xpath("(//div[@class='react-grid-Cell__value'])[2]");
    }
    private By clickBtnSimpan(){
        return By.xpath("//button[@data-style='expand-right']/span[text()='Simpan']");
    }
    private By validateStatus(){
        return By.xpath("//div[@id='root']/div/div/li");
    }
    public void ClickSideBarITem(){
        $(clickSideBarItem()).click();
    }
    public void ClickSideBarPersediaan(){
        $(clickSideBarPersediaan()).click();
    }
    public void ClickBoxItem(){
        $(clickBoxCheckItem()).click();
    }
    public void ClickBtnPenyesuaianPersediaan(){
        $(clickBtnPenyesuaianPersediaan()).click();
    }
    public void ClickInputNewQty(){
        $(inputNewQty()).click();
    }
    public void InputNewQty(){
        $(inputNewQty()).sendKeys("1");
    }
    public void ClickBtnSimpan(){
        $(clickBtnSimpan()).click();
    }
    public void ValidateStatus(){
        $(validateStatus()).isDisplayed();
    }
}
