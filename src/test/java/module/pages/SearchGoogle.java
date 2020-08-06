package module.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SearchGoogle extends BasePage {

    private  By searchBox= By.name("q");
    private By searchResults=By.xpath("//h3[text()='Muno Collection – MunoCollection']");


    //validate whether the google page is loaded
    public void validateGoogle(){
        Assert.assertTrue("Goolge page is not loaded",driver.getCurrentUrl().contains("https://www.google.com"));
    }

    public void searchOnGoogle(String text) {
        type(searchBox,text);
    }

    public void verifySearchResults(String expectedResult) {
        Assert.assertTrue("Cannot find"+expectedResult, isExist(searchResults));

    }

    public void verifyWebsite(String expectedResult) {
        click(searchResults);
        Assert.assertTrue("Site is not displayed",getWebDriver().getCurrentUrl().contains("www.munocollection.com"));
       // waiting(5);
    }
}
