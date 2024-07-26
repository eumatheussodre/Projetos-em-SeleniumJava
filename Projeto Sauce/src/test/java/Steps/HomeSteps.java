package Steps;

import Pages.SauceHomePage;
import Pages.SauceLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static Runners.RunnerBase.getDriver;

public class HomeSteps {

    SauceHomePage homePage = new SauceHomePage();
    @And("estou na tela inicial")
    public void estouNaTelaInicial() {
        homePage.clicarNoBtn();
    }

    @When("seleciono a blusa noir jacket")
    public void selecionoABlusaNoirJacket() {
        homePage.clicarJacket2();
    }

    @And("clico no botão do menu checkout")
    public void clicoNoBotaoDoMenuCheckout() {
        homePage.clicarCheckout();
    }
}
