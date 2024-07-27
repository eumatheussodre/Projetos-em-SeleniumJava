package Steps;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("acessando o Dashboard e logando")
    public void acessandoODashboardELogando() {
        loginPage.acessandoSite();
        loginPage.setDigitandoEmail();
        loginPage.setDigitandoSenha();
        loginPage.setButtonLogin();
        loginPage.esperarElemento();
    }
}
