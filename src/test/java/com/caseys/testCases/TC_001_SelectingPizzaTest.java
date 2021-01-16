package com.caseys.testCases;

import org.testng.annotations.Test;

import com.caseys.base.BaseTest;
import com.caseys.pageObjects.HomeCaseyPage;



public class TC_001_SelectingPizzaTest extends BaseTest {
	@Test
	public void clickingonPizza() {
		
		
		HomeCaseyPage home = new HomeCaseyPage(driver);
	home.goToMenu();
	log.info("Mouse hover to Menu"  );
	home.clickpizza();
	log.info("Clicking on Pizza"  );
		
	}

}
