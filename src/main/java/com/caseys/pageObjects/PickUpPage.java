package com.caseys.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.caseys.basePage.BasePage;

public class PickUpPage extends BasePage {

	public PickUpPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "/html/body/div[2]/section/div[2]/div[2]/div/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[1]/div/div/div[2]/button")
	public WebElement clickStoreDetails;

	@FindBy(xpath = "/html/body/div[2]/section/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/div/div/div[2]/div[1]/div")
	public WebElement storedetails;
	
	@FindBy(xpath="/html/body/div[2]/section/div[2]/div[2]/div/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[3]/form/div/div[1]/div[2]/label[2]/div")
	public WebElement curbside;
	
	@FindBy(xpath="//div[1]/div/div/div[3]/form/div/div/div/div[1]//select")
	public WebElement pickUpStatus;
	
	@FindBy(xpath="//div[1]/div/div/div[3]/form/div/div/div/div[2]//select")
	public WebElement pickUpTime;
	
	@FindBy(xpath="/html/body/div[2]/section/div[2]/div[2]/div/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[3]/form/button")
	public WebElement orderBtn;
	
	public void clickOnStoreDetails() {
		clickStoreDetails.click();
		System.out.println("Store hours are : " + storedetails.getText());
		System.out.println();
		
	}
	
	public void clickCurbSide() {
		curbside.click();
	}

	public void pickUpWay() throws InterruptedException {
		
		Select select = new Select(pickUpStatus);
		
		select.selectByValue("2");
		Thread.sleep(3000);
	}
	
	public void timeForPickUp() {
		
		Select select = new Select(pickUpTime);
		select.selectByIndex(4);
		
		
	}
	
	public void clickOnSubmitOrder() {
		orderBtn.click();
	}

}
