package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.*;

public class MetasPage extends RunCucumberTest {


    @FindBy(xpath = "//a[normalize-space()='Metas']")
    private static WebElement acessandoModulo;

    @FindBy(xpath = "//button[normalize-space()='Crie aqui!']")
    private static WebElement buttonAddMeta;

    @FindBy(xpath = "//input[@placeholder='Digite o nome da sua meta']")
    private static WebElement addNome;

    @FindBy(xpath = "//input[@placeholder='Digite a descrição da sua meta']")
    private static WebElement addMotivo;

    @FindBy(xpath = "//input[@placeholder='R$ 0,00']")
    private static WebElement addValor;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private static WebElement buttonAdd;


    public MetasPage(){
        PageFactory.initElements(getDriver(), this);
    }

    public void setAcessandoModuloMetas(){
        clicar(acessandoModulo);
    }

    public void setConfigurandoMeta() throws InterruptedException {
        clicar(buttonAddMeta);
        digitar(addNome,"Meta de Teste");
        digitar(addMotivo,"Isso foi feito via Teste Automatizado!");
        digitar(addValor,"1000");
        aguardar();
        clicar(buttonAdd);
    }

}
