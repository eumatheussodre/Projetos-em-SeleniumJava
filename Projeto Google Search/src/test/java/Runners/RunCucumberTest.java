package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {},
        features = {"src/test/resources/features"},
        tags = "@saudeDemo",
        glue = {"Steps"}
)
public class RunCucumberTest extends RunnerBase {
    @AfterClass

    public static void stop() throws IOException {
        // Tirar a screenshot e salvar como arquivo
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Criar um nome de arquivo com timestamp
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String fileName = "screenshot_" + timestamp + ".png";

        // Salvar o arquivo no diretório especificado
        FileHandler.copy(screenshot, new File("./src/" + fileName));
//        driver.quit();
    }
}
