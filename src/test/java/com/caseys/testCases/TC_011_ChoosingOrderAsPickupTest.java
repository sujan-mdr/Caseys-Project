package com.caseys.testCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.caseys.base.BaseTest;
import com.caseys.pageObjects.CreateOwnPizPage;
import com.caseys.pageObjects.HomeCaseyPage;

import com.caseys.utilities.TestUtil;

public class TC_011_ChoosingOrderAsPickupTest extends BaseTest {
	
	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void choosingOrderAsPickUpTest(String address) throws AWTException, InterruptedException
	{
	HomeCaseyPage home = new HomeCaseyPage(driver);
	CreateOwnPizPage cop = new CreateOwnPizPage(driver);
	

	home.goToMenu();
	log.info("Mouse Hover to Menu");
	home.clickpizza().clickOnCreateOwnPizza();
	log.info("Clicking on Create Your Own Pizza after clicking on Pizza!!");

	 log.info("Selecting the quantity");
	cop.selectQuantityOfPizza();
    log.info("Selected the quantity");
	cop.selectQualityOfPizza();
	log.info("Selected the quality");
	cop.selectSizeOfPizza();
	log.info("Selected the size");

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

	cop.printAllergenInfo();
	log.info("Printed Allergen Info");

	cop.startOrder();
	log.info("Clicking on Start Order");

	cop.clickOnPickUp();
	log.info("pickup selected");

	cop.pickUpAdd(address);
	log.info("Address entered");
	
	Thread.sleep(2000);

	

}

}
