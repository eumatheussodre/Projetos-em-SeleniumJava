package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.clicar;
import static Utils.Utils.digitar;

public class GooglePage extends RunCucumberTest {


    @FindBy(xpath = "//textarea[contains(@id,'APjFqb')]")
    private static WebElement search;

    @FindBy(xpath = "//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")
    private static WebElement clicandoEmPesquisar;

    @FindBy(xpath = "(//span[contains(.,'Zenvia')])[1]")
    private static WebElement clicandoNoResultado;

    public GooglePage(){
        PageFactory.initElements(getDriver(), this);
    }

    public void setSearch() {
        digitar(search, "Zenvia");
    }

    public void acessandoGoogle(){
        getDriver().get("https://www.google.com.br");
    }

    public void setClicandoEmPesquisar(){
        clicar(clicandoEmPesquisar);
    }

    public void setClicandoNoResultado(){
        clicar(clicandoNoResultado);
    }
}
