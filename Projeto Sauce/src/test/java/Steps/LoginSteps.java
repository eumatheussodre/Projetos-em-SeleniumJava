package Steps;

import Pages.SauceLoginPage;
import io.cucumber.java.en.Given;

import static Runners.RunnerBase.getDriver;

public class LoginSteps{

    SauceLoginPage loginPage = new SauceLoginPage();
    @Given("realizar o login no site sauce demo")
    public void realizarOLoginNoSiteSauceDemo() {
        getDriver().get("https://sauce-demo.myshopify.com/account/login");
        loginPage.digitarEmail();
        loginPage.digitarSenha();
        loginPage.clicarNoBtn();
    }
}
