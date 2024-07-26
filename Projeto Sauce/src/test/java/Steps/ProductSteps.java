package Steps;

import Pages.SauceProductPage;
import io.cucumber.java.en.And;



public class ProductSteps {


    SauceProductPage productPage = new SauceProductPage();


    @And("escolho o tamanho {string}")
    public void escolhoOTamanho(String texto) {
        productPage.setSelectSize(texto);
    }

    @And("escolho a cor {string}")
    public void escolhoACor(String texto) {
        productPage.setSelectColor(texto);
    }

    @And("clico no botão adicionar ao carrinho")
    public void clicoNoBotaoAdicionarAoCarrinho() {
        productPage.addCart();
    }
}
