package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @After// her senaryodan sonra çalışacak bölüm
    public void after(Scenario senaryo){
        System.out.println("Senaryo Bitti");

        if (senaryo.isFailed()){
            TakesScreenshot ts = (TakesScreenshot) GWD.getDriver();
            byte[] hafizadakiHali = ts.getScreenshotAs(OutputType.BYTES);
            senaryo.attach(hafizadakiHali, "image/png", "screenshot name");
        }
        GWD.quitDriver();
    }
}
