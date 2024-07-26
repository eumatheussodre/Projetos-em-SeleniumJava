package Steps;

import Pages.GooglePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class GoogleSteps {

    GooglePage googlePage = new GooglePage();


    @Given("acessando o Google")
    public void acessandoOGoogle() {
        googlePage.acessandoGoogle();
    }

    @And("digitando a busca e pesquisando")
    public void digitandoABusca() {
        googlePage.setSearch();
        googlePage.setClicandoEmPesquisar();
    }

    @And("clicando no resultado")
    public void clicandoNoResultado() {
        googlePage.setClicandoNoResultado();
    }
}
