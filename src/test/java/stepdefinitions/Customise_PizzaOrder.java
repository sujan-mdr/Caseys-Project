package stepdefinitions;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.caseys.base.BaseTest;
import com.caseys.pageObjects.CreateOwnPizPage;
import com.caseys.pageObjects.HomeCaseyPage;
import com.caseys.pageObjects.PickUpPage;
import com.caseys.pageObjects.PizzaPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Customise_PizzaOrder extends BaseTest {

	public WebDriver driver;
	HomeCaseyPage home;
	CreateOwnPizPage cop;
	PizzaPage piz;
	PickUpPage pick;

	@Given("^I want to navigate to Caseys website \"([^\"]*)\"$")
	public void i_want_to_navigate_to_caseys__website(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		log = Logger.getLogger(BaseTest.class);
		PropertyConfigurator.configure(".\\Properties\\log4j.properties");
		log.info("Test Execution has started!!!");
	}

	@When("^I go to Menu$")
	public void i_go_to_menu() {
		home = new HomeCaseyPage(driver);
		home.goToMenu();
		log.info("Mouse Hover to Menu");
	}

	@Then("^I select Pizza from the menu$")
	public void i_select_Pizza_from_the_menu() {

		home.clickpizza();
		log.info("Clicking on Create Your Own Pizza after clicking on Pizza!!");
	}

	@And("^Validate that default selection type of pizza Is Single Topping Pizza$")
	public void validate_that_default_selection_type_of_pizza_is_Single_Toping_Pizaa() {

		piz = new PizzaPage(driver);
		piz.clickonSingleTopPizza();

	}

	@And("I click on Create Your Own Pizza")
	public void i_click_on_create_on_your_own_pizza() {

		piz.clickOnCreateOwnPizza();
		log.info("Clicking on Create Your Own Pizza after clicking on Pizza!!");

	}

	@Then("^I validate the title of Page is \"([^\"]*)\"$")
	public void i_validate_the_title_of_page_is(String title) {

		Assert.assertEquals(title, driver.getTitle());
		System.out.println("Title is Present");
	}

	@And("I choose the quantity of Pizza as {string}")
	public void i_choose_the_quantity_of_pizza_as(String Qty) throws InterruptedException {
		cop = new CreateOwnPizPage(driver);
		cop.selectQuantityOfPizza();
		log.info("Selecting the quantity");
	}

	@And("I select pizza as {string}")
	public void i_select_pizza_as(String string) {
		cop.selectQualityOfPizza();
		log.info("Selected the quality");
	}

	@And("I select pizza size as {string}")
	public void i_select_pizza_size_as(String string) {
		cop.selectSizeOfPizza();
		log.info("Selected the size");
	}

	@And("I select Sauce as Marinara Light")
	public void i_select_sauce_as_marinara_light() throws InterruptedException {
		cop.selectSauce();
		log.info("Selecting Sauce Marinara and light");
	}

	@And("I select Cheese as RegularCheese Regular")
	public void i_select_cheese_as_regular_cheese_regular() {
		cop.selectCheese();
		log.info("Selecting Cheese and Regular");
	}

	@And("I select Meats on Pizza")
	public void i_select_meats_on_pizza() throws InterruptedException {
		cop.selectMeats();
		log.info("Selecting meat");

	}

	@Then("I select Veggies on Pizza")
	public void i_select_veggies_as_onion_on_left_in_regular_amount() throws InterruptedException {
		cop.selectVeggies();
		log.info("Selecting veggies");
	}

	@And("I add Special Instruction as Square Cut")
	public void i_add_special_instruction_as_square_cut() {
		cop.selectSpecialInstructions();
		log.info("Special Instruction provided");
	}

	@And("I print Allergen Info")
	public void i_print_allergen_info() {
		cop.printAllergenInfo();
		log.info("Printed Allergen Info");
	}

	@Then("I click on Start Order")
	public void i_click_on_start_order() {
		cop.startOrder();
		log.info("Clicking on Start Order");
	}

	@And("I validate on alert for Pickup or Delivery")
	public void i_validate_on_alert_for_pickup_or_delivery() {
		cop.clickOnPickUp();
		log.info("pickup selected");
	}

	@And("^I enter the address for Pickup as \"([^\"]*\")$")
	public void i_enter_the_address_for_pickup(String address) throws AWTException, InterruptedException {
		cop.pickUpAdd(address);
		log.info("Address entered");
	}

	@Then("verify the store details")
	public void verify_the_store_details() {
		pick = new PickUpPage(driver);
		pick.clickOnStoreDetails();
		log.info("Clicking on Store Details and printed details");
	}

	@And("Click on curbside pickup")
	public void click_on_curbside_pickup() {
		pick.clickCurbSide();
		log.info("Curbside Pickup Selected");
	}

	@And("I select Pickup status")
	public void i_select_pickup_status() throws InterruptedException {
		pick.pickUpWay();
		log.info("The way of Pickup Selected");
	}

	@And("I select Time for Pickup")
	public void i_select_time_for_pickup() {
		pick.timeForPickUp();
		log.info("Time of Pickup selected");
	}

	@Then("I Submit Order")
	public void i_submit_order() {
		pick.clickOnSubmitOrder();
		log.info("Clicked On Submit Order");
	}
	
	@And("I close the browser")
	public void closing() {
		driver.quit();
	}

}
