package com.caseys.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.caseys.basePage.BasePage;



public class HomeCaseyPage extends BasePage {

	public HomeCaseyPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css = "#navbarSupportedContent li.Nav__links-has-submenu")
	public WebElement menus;

	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[1]/div[2]/div/div/div[1]/div/div[2]/ul/li[1]/a")
	public WebElement pizza;

	public void goToMenu() {
		WebElement menu = menus;
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();

	}

	public PizzaPage clickpizza() {
		pizza.click();
		return new PizzaPage(driver);

	}

	public void appsAndSides() {

	}

	public void sandwiches() {

	}

	public void beer() {

	}

	public void deals() {

	}

	public void rewards() {

	}

}
