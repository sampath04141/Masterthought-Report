package module.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage {
    public static WebDriver driver;

    public WebDriver initiateWebDriver(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/module/source/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.google.com");

        return driver;
    }

    public void quiteWebDriver(){
        driver.quit();
    }

    public WebDriver getWebDriver(){
        return driver;
    }

    public void waiting(int sec)  {
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void type(By element, String text){
        WebElement ele=driver.findElement(element);
        ele.clear();
        ele.sendKeys(text);
        ele.sendKeys(Keys.ENTER);
    }
    public WebElement getWebElement(By element){
      return driver.findElement(element);
    }

    public void click(By element){
        getWebElement(element).click();
    }

    public boolean isExist(By element){
        return driver.findElement(element).isDisplayed()?true:false;
    }


}
