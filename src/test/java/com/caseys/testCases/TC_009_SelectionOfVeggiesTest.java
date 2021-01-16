package com.caseys.testCases;

import org.testng.annotations.Test;

import com.caseys.base.BaseTest;
import com.caseys.pageObjects.CreateOwnPizPage;
import com.caseys.pageObjects.HomeCaseyPage;

public class TC_009_SelectionOfVeggiesTest extends BaseTest {
	
	@Test
	public void selectionOfVeggiesTest() throws InterruptedException {

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
		
	}


}
