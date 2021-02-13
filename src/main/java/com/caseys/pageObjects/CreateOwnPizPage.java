package com.caseys.pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.caseys.basePage.BasePage;

public class CreateOwnPizPage extends BasePage {
 
	public CreateOwnPizPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub

	}

	@FindBy(xpath = "/html/body/div[2]/main/div[1]/section[1]/div/div[2]/div/div[3]/label/select")
	public WebElement quantity;

	@FindBy(xpath = "//*[@id=\"FoodItemTypeSelector48\"]")
	public WebElement quality;

	@FindBy(id = "FoodItemSize49")
	public WebElement size;

	@FindBy(xpath = "//*//section[2]/div//div/div[2]/div[2]//label")
	public WebElement sauce;

	@FindBy(xpath = "//*//div/div/div/div/div[2]/div/div//label[1]")
	public WebElement lightmarinara;

	@FindBy(xpath = "//*/div[3]/div/label")
	public WebElement cheese;

	@FindBy(xpath = "//div/div[2]/div[1]/div[2]/div[2]/div/div//label[1]")
	public WebElement lightcheese;

	@FindBy(xpath = "/html/body/div[2]/main/div[1]/section[2]/div/div[2]/div[1]/div[2]/div[4]")
	public WebElement meat;

	/*
	 * @FindBy(xpath=
	 * "//*[@id=\"App\"]/main/div[1]/section[2]/div/div[2]/div[1]/div[2]/div[4]/div/div/div[5]/div/div[2]/label")
	 * public WebElement hammy;
	 */

	@FindBy(xpath = "/html/body/div[2]/main/div[1]/section[2]/div/div[2]/div[1]/div[2]/div[4]/div/div/div[5]/div/div/div[3]/button[1]")
	public WebElement ham;

	@FindBy(xpath = "//div[4]/div/div/div[5]//select")
	public WebElement hamInPizza;

	@FindBy(xpath = "/html/body/div[2]/main/div[1]/section[2]/div/div[2]/div[1]/div[2]/div[4]/div/div/div[5]/div/div[2]/div/label[3]")
	public WebElement qtyOfHam;

	@FindBy(xpath = "//*[@id=\"App\"]/main/div[1]/section[2]/div/div[2]/div[1]/div[2]/div[4]/div/div/div[8]/div/div")
	public WebElement chicken;

	@FindBy(xpath = "//div[8]//select")
	public WebElement chickenInPizaa;

	@FindBy(xpath = "//*[@id=\"App\"]/main/div[1]/section[2]/div/div[2]/div[1]/div[2]/div[4]/div/div/div[8]/div/div[2]/div/label[2]")
	public WebElement qtyofChicken;

	@FindBy(xpath = "//*/div[5]/div/label")
	public WebElement veggies;

	@FindBy(xpath = "//*/div[5]/div/div/div[6]//button[1]")
	public WebElement tomatoes;

	@FindBy(xpath = "/html/body/div[2]/main/div[1]/section[2]/div/div[2]/div[1]/div[2]/div[5]/div/div/div[6]/div/div[2]/div/label[1]/span")
	public WebElement tomatoesInPizza;

	@FindBy(xpath = "/html/body/div[2]/main/div[1]/section[2]/div/div[2]/div[1]/div[2]/div[5]/div/div/div[6]/div/div[2]/label/select")
	public WebElement qtyofTomatoes;

	@FindBy(xpath = "//*[@id=\"App\"]/main/div[1]/section[2]/div/div[2]/div[1]/div[2]/div[5]/div/div/div[2]/div/div/div[3]/button[1]")
	public WebElement onions;

	@FindBy(xpath = "/html/body/div[2]/main/div[1]/section[2]/div/div[2]/div[1]/div[2]/div[5]/div/div/div[2]/div/div[2]/div/label[2]")
	public WebElement onionsInPizza;

	@FindBy(xpath = "/html/body/div[2]/main/div[1]/section[2]/div/div[2]/div[1]/div[2]/div[5]/div/div/div[2]/div/div[2]/label/select")
	public WebElement qtyOfOnions;

	@FindBy(xpath = "//div[5]/div/div/div[3]/button[1]")
	public WebElement pineapple;

	@FindBy(xpath = "//div[5]//div[5]//label[3]")
	public WebElement pineappleInPizza;

	@FindBy(xpath = "//div[5]//div[5]//select")
	public WebElement qtyOfPineapple;

	@FindBy(xpath = "//div[2]/div[6]")
	public WebElement specialIns;

	@FindBy(xpath = "//div[6]//div/div/div/div/button[1]")
	public WebElement addSquareCut;

	@FindBy(xpath = "//*[@id=\"App\"]/main/div[1]/section[2]/div/div[2]/div[1]/div[3]/div")
	public WebElement allergenInfo;

	@FindBy(xpath = "//div/div//div/div/div/div/div[2]/div/div/button")
	public WebElement submitOrder;

	@FindBy(xpath = "//*[@id=\"App\"]/section/div[2]/div/div[2]/div[2]/div[2]")
	public WebElement alerttext;

	@FindBy(xpath = "//section/div[2]/div/div/div/div/div[1]/button")
	public WebElement pickUp;

	@FindBy(xpath = "/html/body/div[2]/section/div[2]/div/div[2]/div/div/div[3]/div/input")
	public WebElement pickUpAddress;

	public void selectQuantityOfPizza() throws InterruptedException {
WebDriverWait wait = new WebDriverWait(driver,10);
		Select select = new Select(quantity);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'240 Cal/Slice (12 Slices)')]")));
		select.selectByVisibleText("2");
	}

	public void selectQualityOfPizza() {

		Select select = new Select(quality);
		select.selectByValue("Original");

	}

	public void selectSizeOfPizza() {

		Select select = new Select(size);
		select.selectByValue("1");

	}

	public void selectSauce() throws InterruptedException {

		sauce.click();
		lightmarinara.click();

	}

	public void selectCheese() {

		cheese.click();
		lightcheese.click();

	}

	public void selectMeats() throws InterruptedException {

		meat.click();
		// selection of Ham
		ham.click();
		qtyOfHam.click();
		// hammy.click();
		Select select = new Select(hamInPizza);
		select.selectByValue("1");

		// selection of Chicken
		chicken.click();
		qtyofChicken.click();
		select = new Select(chickenInPizaa);
		select.selectByValue("0");

	}

	public void selectVeggies() throws InterruptedException {

		veggies.click();
		// selection of Onion
		onions.click();
		Select select = new Select(qtyOfOnions);
		select.selectByValue("1");
		onionsInPizza.click();
		// selection of Tomatoes
		tomatoes.click();
		tomatoesInPizza.click();
		select = new Select(qtyofTomatoes);
		select.selectByValue("2");
		// selection of Pineapple
		pineapple.click();
		select = new Select(qtyOfPineapple);
		select.selectByValue("0");
		pineappleInPizza.click();

	}

	public void selectSpecialInstructions() {
		specialIns.click();
		addSquareCut.click();

	}

	public void printAllergenInfo() {
		System.out.println(allergenInfo.getText());

	}

	public void startOrder() {

		submitOrder.click();

	}

	public void clickOnPickUp() {
		try {
			alerttext.isDisplayed();
			System.out.println(alerttext.getText());
			pickUp.click();
		} catch (Exception e) {
			System.out.println("NO " + alerttext.getText());

		}
	}

	public PickUpPage pickUpAdd(String address) throws AWTException, InterruptedException {
	    WebDriverWait wait = new WebDriverWait(driver,3);
		pickUpAddress.sendKeys(address);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		wait.until(ExpectedConditions.elementToBeClickable(pickUpAddress));
		robot.keyPress(KeyEvent.VK_ENTER);

		return new PickUpPage(driver);
	}

}
