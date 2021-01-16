package rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;




import io.github.bonigarcia.wdm.WebDriverManager;

public class OrderPizza {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.caseys.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, 50);

		WebElement menu = driver.findElement(By.cssSelector("#navbarSupportedContent li.Nav__links-has-submenu"));
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]//li/div[2]/div/div/div[1]//li[1]/a")).click();
		try {
			driver.findElement(By.xpath("//*//section[3]//button[1]")).isSelected();
			System.out.println("is selected");

			driver.findElement(By.xpath(
					"//*[@id=\"App\"]/main/div/section[4]/div/div[1]/div/div/div/div[1]/div/div[1]/div[2]/button/h3"))
					.click();
		} catch (Exception e) {
			System.out.println("is not Selected");

		}

		
		WebElement qty =driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/section[1]/div/div[2]/div/div[3]/label/select"));
		
		Select select= new Select(qty);
		select.selectByIndex(2);
		
	WebElement types = driver.findElement(By.xpath("//*[@id=\"FoodItemTypeSelector48\"]"));
	 select = new Select(types);
	
	select.selectByValue("Original");
	
  
	WebElement size = driver.findElement(By.xpath("//*[@id=\"FoodItemSize49\"]"));
	select = new Select(size);
	select.selectByIndex(1);
	   

	driver.findElement(By.xpath("//*[@id=\"App\"]/main/div[1]/section[2]/div/div[2]/div[1]/div[2]/div[2]/div/label")).click();
	
	driver.findElement(By.xpath("//*[@id=\"App\"]/main/div[1]/section[2]/div/div[2]/div[1]/div[2]/div[2]//label[1]/span")).click();

	driver.findElement(By.xpath("//*/div[3]/div/label")).click();
	driver.findElement(By.xpath("//*/div[2]/div/label[2]")).click();
	
	
	
	}
	}
