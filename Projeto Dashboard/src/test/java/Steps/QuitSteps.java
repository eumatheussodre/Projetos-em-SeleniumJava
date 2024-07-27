package Steps;

import Pages.MetasPage;
import Pages.QuitPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class QuitSteps {

    QuitPage quitPage = new QuitPage();

    @Then("saindo da conta")
    public void saindoDaConta() {
        quitPage.setSaindoDoDashboard();
    }
}
