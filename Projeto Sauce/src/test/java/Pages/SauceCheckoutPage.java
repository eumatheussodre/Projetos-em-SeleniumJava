package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.clicar;
import static Utils.Utils.pegarTexto;

public class SauceCheckoutPage extends RunCucumberTest {
    @FindBy(css = "div.six.columns.alpha.description > div > h3 > a" )
    private WebElement titlePedido;

    public SauceCheckoutPage(){
        PageFactory.initElements(getDriver(), this);
    }

    public String getTexto(){
        return pegarTexto(titlePedido);
    }

}
