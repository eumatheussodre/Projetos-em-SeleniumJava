package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.clicar;
import static Utils.Utils.selecionarComboBox;

public class SauceProductPage extends RunCucumberTest {
    @FindBy(id = "product-select-option-0" )
    private WebElement selectSize;

    @FindBy(id = "product-select-option-1")
    private WebElement selectColor;

    @FindBy(id = "add")
    private WebElement btnClicar;

    public SauceProductPage(){
        PageFactory.initElements(getDriver(), this);
    }

    public void setSelectSize(String texto){
        selecionarComboBox(selectSize, texto);
    }

    public void setSelectColor(String texto){
        selecionarComboBox(selectColor, texto);
    }

    public void addCart(){
        clicar(btnClicar);
    }

}
