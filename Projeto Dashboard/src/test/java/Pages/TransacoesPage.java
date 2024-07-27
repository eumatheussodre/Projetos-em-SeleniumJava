package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.*;

public class TransacoesPage extends RunCucumberTest {


    @FindBy(id = "email")
    private static WebElement digitandoEmail;

    @FindBy(id = "password")
    private static WebElement digitandoPass;

    @FindBy(xpath = "//button[normalize-space()='Acessar']")
    private static WebElement clicandoButton;

    @FindBy(css = "span[class='font-bold text-3xl md:text-5xl']")
    private static WebElement elementoApareceu;


    public TransacoesPage(){
        PageFactory.initElements(getDriver(), this);
    }

    public void setDigitandoEmail(){
        digitar(digitandoEmail,"testeqa@gmail.com");
    }

    public void setDigitandoSenha(){
        digitar(digitandoPass, "M@th040698");
    }

    public void setButtonLogin(){
        clicar(clicandoButton);
    }

    public void acessandoSite(){
        getDriver().get("https://front-boardv1-hqfewf3xaq-rj.a.run.app/login");
    }

    public void esperarElemento(){
        esperarElementoAparecer(elementoApareceu);
    }
}
