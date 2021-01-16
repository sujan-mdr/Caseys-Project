package com.caseys.testCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.caseys.base.BaseTest;
import com.caseys.pageObjects.CreateOwnPizPage;
import com.caseys.pageObjects.HomeCaseyPage;
import com.caseys.pageObjects.PickUpPage;
import com.caseys.utilities.TestUtil;

public class TC_012_OrderCustomizePizzaTest extends BaseTest {

	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void orderCustomizePizzaTest(String address) throws InterruptedException, AWTException {

		HomeCaseyPage home = new HomeCaseyPage(driver);
		CreateOwnPizPage cop = new CreateOwnPizPage(driver);
		PickUpPage pick = new PickUpPage(driver);
		// Selecting Pizza after Going to MENU
		home.goToMenu();
		log.info("Mouse Hover to Menu");
		home.clickpizza().clickOnCreateOwnPizza();
		log.info("Clicking on Create Your Own Pizza after clicking on Pizza!!");

		// Selecting Pizza Types as Single topping pizza
		log.info("Selecting the quantity");
		cop.selectQuantityOfPizza();
		log.info("Selected the quantity");
		cop.selectQualityOfPizza();
		log.info("Selected the quality");
		cop.selectSizeOfPizza();
		log.info("Selected the size");

		// Selecting Ingredients
		cop.selectSauce();
		log.info("Selecting Sauce Marinara and light");
		cop.selectCheese();
		log.info("Selecting Cheese and Regular");
		cop.selectMeats();
		log.info("Selecting meat");
		cop.selectVeggies();
		log.info("Selecting veggies");
		cop.selectSpecialInstructions();
		log.info("Special Instruction provided");
		
		//printing allergy info	
		cop.printAllergenInfo();
		log.info("Printed Allergen Info");

		//Starting Order as Pickup as Curb side
		cop.startOrder();
		log.info("Clicking on Start Order");
		cop.clickOnPickUp();
		log.info("pickup selected");
		cop.pickUpAdd(address);
		log.info("Address entered");
		pick.clickOnStoreDetails();
		log.info("Clicking on Store Details and printed details");
		pick.clickCurbSide();
		log.info("Curbside Pickup Selected");
		pick.pickUpWay();
		log.info("The way of Pickup Selected");
		pick.timeForPickUp();
		log.info("Time of Pickup selected");
		pick.clickOnSubmitOrder();
		log.info("Clicked On Submit Order");

	}

}
