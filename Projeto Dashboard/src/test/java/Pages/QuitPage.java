package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.*;

public class QuitPage extends RunCucumberTest {


    @FindBy(xpath = "//a[normalize-space()='Sair']")
    private static WebElement saindoDaPagina;

    @FindBy(id = "email")
    private static WebElement visibleQuit;

    public QuitPage(){
        PageFactory.initElements(getDriver(), this);
    }

    public void setSaindoDoDashboard() {
        clicar(saindoDaPagina);
        esperarElementoAparecer(visibleQuit);
    }

}
