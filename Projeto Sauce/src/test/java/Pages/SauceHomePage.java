package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.clicar;

public class SauceHomePage extends RunCucumberTest {
    @FindBy(css = "#logo > a" )
    private WebElement clickBtn;

    @FindBy(id = "product-2" )
    private WebElement jacket2;

    @FindBy(css = "#minicart > a.checkout")
    private WebElement btnCheckout;

    public SauceHomePage(){
        PageFactory.initElements(getDriver(), this);
    }
    public void clicarNoBtn(){
        clicar(clickBtn);
    }

    public void clicarJacket2(){
        clicar(jacket2);
    }

    public void clicarCheckout() throws InterruptedException {
        Thread.sleep(2000);
        getDriver().navigate().to("https://sauce-demo.myshopify.com/cart");
    }
}
