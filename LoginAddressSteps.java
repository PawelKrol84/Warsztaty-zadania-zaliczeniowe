import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class LoginAddressSteps {

    WebDriver webDriver;
    WebDriverWait wait;
    @Given("I open the browser")
    public void iOpenTheBrowser() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pkrol\\WebDriver\\chromedriver.exe");
        webDriver = new ChromeDriver();
        wait = new WebDriverWait(webDriver, 3);
    }

    @And("I go to mystore website")
    public void iGoToMystoreWebsite() {
        webDriver.get("https://mystore-testlab.coderslab.pl/index.php");
    }

    @And("I click the sign in button")
    public void iClickTheSignInButton() {
        WebElement element = webDriver.findElement(By.cssSelector("span.hidden-sm-down"));
        element.click();
    }

    @When("I type {string} as email")
    public void iTypeAsEmail(String email) {
        WebElement element = webDriver.findElement(By.cssSelector("input[type='email']"));
        element.sendKeys(email);
    }

    @And("I enter the password {string}")
    public void iEnterThePassword(String password) {
        WebElement element = webDriver.findElement(By.cssSelector("input[name='password']"));
        element.sendKeys(password);
    }

    @Then("I click sign in button")
    public void iClickSignInButton() {
        WebElement element = webDriver.findElement(By.cssSelector("button[type='submit']"));
        element.click();
    }

    @And("I click Addresses button")
    public void iClickAddressesButton() {
        WebElement element = webDriver.findElement(By.cssSelector("a[id='addresses-link']"));
        element.click();
    }

    @And("I click + Create new address button")
    public void iClickCreateNewAddressButton() {
        WebElement element = webDriver.findElement(By.cssSelector("a[data-link-action='add-address']"));
        element.click();
    }

    @When("I type {string} as alias and {string} as address and {string} as city and {string} as zip_code and {string} as country and {string} as phone")
    public void iTypeAsAliasAndAsAddressAndAsCityAndAsZip_codeAndAsCountryAndAsPhone(String alias, String address, String city, String zip_code, String country, String phone) {
        WebElement element = webDriver.findElement(By.cssSelector("input[id='field-alias']"));
        element.sendKeys(alias);
        WebElement element2 = webDriver.findElement(By.cssSelector("input[id='field-address1']"));
        element2.sendKeys(address);
        WebElement element3 = webDriver.findElement(By.cssSelector("input[id='field-city']"));
        element3.sendKeys(city);
        WebElement element4 = webDriver.findElement(By.cssSelector("input[id='field-postcode']"));
        element4.sendKeys(zip_code);
        WebElement element5 = webDriver.findElement(By.cssSelector("select[id='field-id_country']"));
        element5.sendKeys(country);
        WebElement element6 = webDriver.findElement(By.cssSelector("input[id='field-phone']"));
        element6.sendKeys(phone);
    }
    @Then("I click save button")
    public void iClickSaveButton() {
        WebElement element = webDriver.findElement(By.cssSelector("button[class='btn btn-primary form-control-submit float-xs-right']"));
        element.click();
    }
}
