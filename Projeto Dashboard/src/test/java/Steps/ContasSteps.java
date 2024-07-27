package Steps;

import Pages.ContasPage;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class ContasSteps {

    ContasPage contasPage = new ContasPage();

    @And("acessando modulo de Contas")
    public void acessandoModuloDeContas() throws InterruptedException {
        contasPage.setAcessandoModuloContas();
        contasPage.setAdicionarConta();
        contasPage.setAdicionandoBanco();
    }
}
