package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.*;

public class ContasPage extends RunCucumberTest {


    @FindBy(xpath = "//a[normalize-space()='Conta']")
    private static WebElement acessandoModuloContas;

    @FindBy(xpath = "//button[normalize-space()='Adicione aqui!']")
    private static WebElement adicionarConta;

    @FindBy(css = "input[placeholder='Digite o nome do banco']")
    private static WebElement adicionandoBanco;

    @FindBy(css = "input[placeholder='0000-0']")
    private static WebElement adicionandoConta;

    @FindBy(css = "input[placeholder='R$ 0,00']")
    private static WebElement adicionandoValor;

    @FindBy(css = "select[name='account']")
    private static WebElement comboxContas;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private static WebElement buttonAddConta;




    public ContasPage(){
        PageFactory.initElements(getDriver(), this);
    }

    public void setAcessandoModuloContas(){
        clicar(acessandoModuloContas);
    }

    public void setAdicionarConta(){
        clicar(adicionarConta);
    }

    public void setAdicionandoBanco() throws InterruptedException {
        digitar(adicionandoBanco,"Banco Teste");
        digitar(adicionandoConta,"111111");
        digitar(adicionandoValor,"3000000");
        selecionarComboBox(comboxContas,"Salário");
        Thread.sleep(2000);
        clicar(buttonAddConta);
    }
}
