package stepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySteps {
  public WebDriver driver;
    @Given("^I navigate to BlueSky Citadel site$")
    public void iNavigateToBlueSkyCitadelSite() {
      System.setProperty("webdriver.chrome.driver","C:\\Users\\Christy\\Documents\\chromedriver\\chromedriver.exe");
       // WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
       driver.get("https://blueskycitadel.com/automation-testing-form/");
       driver.manage().window().maximize();

    }

    @And("^I click on register link$")
    public void iClickOnRegisterLink() {
        driver.findElement(By.xpath("//*[@id=\"menu-item-1283\"]/a")).click();

    }

    @And("^I enter the single line Text$")
    public void iEnterTheSingleLineText() {

    }

    @And("^I pick one select$")
    public void iPickOneSelect() {

    }

    @And("^I enter my email$")
    public void iEnterMyEmail() {

    }

    @And("^I enter my password$")
    public void iEnterMyPassword() {

    }

    @And("^I pick multi select$")
    public void iPickMultiSelect() {

    }

    @And("^I select radio and checkbox lists$")
    public void iSelectRadioAndCheckboxLists() {

    }

    @And("^I select country and date$")
    public void iSelectCountryAndDate() {
    }
//    @Then("^I fill the register details$")
//    public void iFillTheRegisterDetails() {
//        driver.findElement(By.cssSelector("#username")).sendKeys("femiadekomaya@yahoo.com");
//        driver.findElement(By.cssSelector("#password")).sendKeys("ipso12?");
//    }

  @Then("^I fill the register details$")
  public void iFillTheRegisterDetails() {
  }
  @Then("^I am register$")
  public void iAmRegister() {
    driver.findElement(By.cssSelector("input[value='Login']")).click();
    driver.close();
  }
}
