package com.caseys.pageObjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.caseys.basePage.BasePage;

public class PizzaPage extends BasePage {

	public PizzaPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	@FindBy(xpath="//*//section[3]//button[1]") 
	public WebElement singleToppingPizza;
	
	@FindBy(xpath="//*[@id=\"App\"]/main/div/section[4]/div/div[1]/div/div/div/div[1]/div/div[1]/div[2]/button/h3")
	public WebElement createYourOwnPizza;
	
	
	public void clickonSingleTopPizza() {
		
		singleToppingPizza.click();
		try {
			singleToppingPizza.isSelected();
			System.out.println("Inside Single topping Pizza page");

		} catch (Exception e) {
			System.out.println("Not a valid Pizza page");

		}
	}
	
	
	public CreateOwnPizPage clickOnCreateOwnPizza() {
		
		createYourOwnPizza.click();
		
		return new CreateOwnPizPage(driver);
		
	}
	

}
