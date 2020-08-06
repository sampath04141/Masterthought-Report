package module.utils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import module.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class Hooks extends BasePage {
     public WebDriver driver=null;

    @Before
    public void start() throws InterruptedException {
        System.out.println("______START____________");
        initiateWebDriver();
    }

    @After
    public void closeDriver(){
        System.out.println("-----TEST PROGRAM OVER------");
        quiteWebDriver();
    }


}
