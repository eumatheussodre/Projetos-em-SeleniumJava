package Steps;

import Pages.SauceCheckoutPage;
import Pages.SauceHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckoutSteps {

    private static final String TITLE_PEDIDO = "Noir jacket - L / Red";
    SauceCheckoutPage checkoutPage = new SauceCheckoutPage();

    @Then("verifico se o titulo do pedido esta correto")
    public void verificoSeOTituloDoPedidoEstaCorreto() {
        Assert.assertEquals(checkoutPage.getTexto(), TITLE_PEDIDO);
    }
}
