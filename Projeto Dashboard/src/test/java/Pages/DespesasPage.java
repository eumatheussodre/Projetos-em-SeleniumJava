package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.*;

public class DespesasPage extends RunCucumberTest {


    @FindBy(xpath = "//a[normalize-space()='Despesas']")
    private static WebElement acessandoModuloDespesas;

    @FindBy(xpath = "//button[normalize-space()='Adicione aqui!']")
    private static WebElement buttonAddDespesas;

    @FindBy(xpath = "//input[@placeholder='Digite a descrição da despesa']")
    private static WebElement descricao;

    @FindBy(xpath = "//input[@placeholder='R$ 0,00']")
    private static WebElement valor;

    @FindBy(xpath = "//select[@name='monthlyExpenseType']")
    private static WebElement comboxDespesa;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private static WebElement buttonAdd;


    public DespesasPage(){
        PageFactory.initElements(getDriver(), this);
    }

    public void setAcessandoModuloDespesas(){
        clicar(acessandoModuloDespesas);
        clicar(buttonAddDespesas);
    }

    public void setPublicandoDespesa() {
        digitar(descricao,"Despesa Teste");
        digitar(valor,"1000");
        selecionarComboBox(comboxDespesa,"Alimentação");
        clicar(buttonAdd);
    }

}
