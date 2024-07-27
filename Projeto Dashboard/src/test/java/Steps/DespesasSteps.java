package Steps;

import Pages.DespesasPage;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class DespesasSteps {

    DespesasPage despesasPage = new DespesasPage();

    @And("acessando modulo de Despesas")
    public void acessandoModuloDeDespesas() throws InterruptedException {
        despesasPage.setAcessandoModuloDespesas();
        Thread.sleep(2000);
        despesasPage.setPublicandoDespesa();
    }
}
