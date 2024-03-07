import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task2Steps {
    WebDriver webDriver;
    WebDriverWait wait;
    @Given("I am logged in mystore page")
    public void iAmLoggedInMystorePage() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pkrol\\WebDriver\\chromedriver.exe");
        webDriver = new ChromeDriver();
        wait = new WebDriverWait(webDriver, 5);

        webDriver.get("https://mystore-testlab.coderslab.pl/index.php");

        WebElement element = webDriver.findElement(By.cssSelector("span.hidden-sm-down"));
        element.click();

        String email = "king252@wp.pl";

        element = webDriver.findElement(By.cssSelector("input[type='email']"));
        element.sendKeys(email);

        String password = "qwerty";

        element = webDriver.findElement(By.cssSelector("input[name='password']"));
        element.sendKeys(password);

        element = webDriver.findElement(By.cssSelector("button[type='submit']"));
        element.click();
    }

    @And("I go to the clothes page")
    public void iGoToTheClothesPage() {
        WebElement element = webDriver.findElement(By.xpath("//*[@id='category-3']/a"));
        element.click();
    }

    @And("I choose Hummingbird Printed Sweater")
    public void iChooseHummingbirdPrintedSweater() {
        WebElement element = webDriver.findElement(By.cssSelector("img[alt='Brown bear printed sweater']"));
        element.click();
    }

    @And("I choose size M")
    public void iChooseSizeM() {
        WebElement sizeDropdown = webDriver.findElement(By.id("group_1"));
        Select sizeSelect = new Select(sizeDropdown);
        sizeSelect.selectByVisibleText("M");
    }

    @And("I choose five pieces")
    public void iChooseFivePieces() {
        WebElement element = webDriver.findElement(By.xpath("//*[@id='add-to-cart-or-refresh']/div[2]/div[1]/div[1]/div/span[3]/button[1]/i"));
        element.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='add-to-cart-or-refresh']/div[2]/div[1]/div[1]/div/span[3]/button[1]/i")));
        element.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='add-to-cart-or-refresh']/div[2]/div[1]/div[1]/div/span[3]/button[1]/i")));
        element.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='add-to-cart-or-refresh']/div[2]/div[1]/div[1]/div/span[3]/button[1]/i")));
        element.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='add-to-cart-or-refresh']/div[2]/div[1]/div[1]/div/span[3]/button[1]/i")));
        element.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='add-to-cart-or-refresh']/div[2]/div[1]/div[1]/div/span[3]/button[1]/i")));
        element.click();
    }

    @When("I click add to cart button")
    public void iClickAddToCartButton() {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));
        WebElement element = webDriver.findElement(By.cssSelector("button[type='submit']"));
        element.click();
    }

    @And("I click proceed to checkout button")
    public void iClickProceedToCheckoutButton() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='blockcart-modal']/div/div/div[2]/div/div[2]/div/div/a")));
        WebElement element = webDriver.findElement(By.xpath("//*[@id='blockcart-modal']/div/div/div[2]/div/div[2]/div/div/a"));
        element.click();
    }

    @And("I click proceed to checkout button two")
    public void iClickProceedToCheckoutButtonTwo() {
        WebElement element = webDriver.findElement(By.xpath("//*[@id='main']/div/div[2]/div[1]/div[2]/div/a"));
        element.click();
    }

    @And("I click continue button")
    public void iClickContinueButton() {
        WebElement element = webDriver.findElement(By.xpath("//*[@id='checkout-addresses-step']/div/div/form/div[2]/button"));
        element.click();
    }

    @And("I click continue button two")
    public void iClickContinueButtonTwo() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='js-delivery']/button")));
        WebElement element = webDriver.findElement(By.xpath("//*[@id='js-delivery']/button"));
        element.click();
    }

    @Then("I click the options Pay by Check")
    public void iClickTheOptionsPayByCheck() {
        WebElement element = webDriver.findElement(By.cssSelector("input[id='payment-option-1']"));
        element.click();
    }

    @And("I click I agree to the terms of service and will adhere to them unconditionally.")
    public void iClickIAgreeToTheTermsOfServiceAndWillAdhereToThemUnconditionally() {
        WebElement element = webDriver.findElement(By.cssSelector("input[id='conditions_to_approve[terms-and-conditions]']"));
        element.click();
    }

    @And("I click place order button")
    public void iClickPlaceOrderButton() {
        WebElement element = webDriver.findElement(By.xpath("//*[@id='payment-confirmation']/div[1]/button"));
        element.click();
    }
}
