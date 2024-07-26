package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.clicar;
import static Utils.Utils.digitar;


public class SauceLoginPage extends RunCucumberTest {

    @FindBy(id = "customer_email" )
    private WebElement campoEmail;

    @FindBy(id = "customer_password" )
    private WebElement campoSenha;

    @FindBy(css = "#customer_login > div.action_bottom > input" )
    private WebElement btnLogin;


    public SauceLoginPage(){
        PageFactory.initElements(getDriver(), this);
    }
    public void digitarEmail(){
        digitar(campoEmail,"cursodeqa@gmail.com");
    }

    public void digitarSenha(){
        digitar(campoSenha, System.getenv("senha"));
    }

    public void clicarNoBtn(){
        clicar(btnLogin);
    }
}

