package com.caseys.testCases;


import org.testng.annotations.Test;

import com.caseys.base.BaseTest;
import com.caseys.pageObjects.HomeCaseyPage;
import com.caseys.pageObjects.PizzaPage;

public class TC_002_SelectCreateOwnPizzaTest extends BaseTest {

	@Test
	public void clickingOnCreateYourOwnPizza() {

		HomeCaseyPage home = new HomeCaseyPage(driver);
		home.goToMenu();
		log.info("Mouse hover to Menu");
		home.clickpizza();
		log.info("Clicked on Pizza");
		
		PizzaPage piz = new PizzaPage(driver);
		piz.clickonSingleTopPizza();
		log.info("Clicked on Single Topping Pizza");
		piz.clickOnCreateOwnPizza();
		log.info("Clicked on Create your Own Pizza");
	}

}
