package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.*;

public class TransacoesPage extends RunCucumberTest {


    @FindBy(xpath = "//a[normalize-space()='Transacoes']")
    private static WebElement AcessandoTransacoes;

    @FindBy(xpath = "//button[normalize-space()='Pague aqui!']")
    private static WebElement pagarContas;

    @FindBy(xpath = "//button[contains(@class,'flex w-full justify-center rounded-md bg-tela_de_fundo px-3 py-1.5 text-sm font-semibold leading-6 text-white shadow-sm hover:bg-indigo-500 focus-visible:outline focus-visible:outline-2 focus-visible:outline-offset-2 focus-visible:outline-indigo-600')]")
    private static WebElement pagandoConta;

    @FindBy(css = "body > div:nth-child(1) > main:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(3) > button:nth-child(1)")
    private static WebElement clicandoDeposito;


    @FindBy(xpath = "(//select[@name='nameGoal'])[1]")
    private static WebElement nomeMeta;

    @FindBy(xpath = "//input[@placeholder='R$ 0,00']")
    private static WebElement addValorDeposito;

    @FindBy(xpath = "//button[contains(@class,'flex w-full justify-center rounded-md bg-tela_de_fundo px-3 py-1.5 text-sm font-semibold leading-6 text-white shadow-sm hover:bg-indigo-500 focus-visible:outline focus-visible:outline-2 focus-visible:outline-offset-2 focus-visible:outline-indigo-600')]")
    private static WebElement buttonAddMeta;

    public TransacoesPage(){
        PageFactory.initElements(getDriver(), this);
    }

    public void setAcessandoTransacoes(){
        clicar(AcessandoTransacoes);
    }

    public void setConfigurandoTransacoes() throws InterruptedException {
        aguardar();
        clicar(pagarContas);
        clicar(pagandoConta);
        aguardar();
        clicar(clicandoDeposito);
        selecionarComboBox(nomeMeta,"Meta de Teste");
        digitar(addValorDeposito,"150000");
        aguardar();
        clicar(buttonAddMeta);
    }
}
