package com.caseys.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.caseys.utilities.ExcelReader;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {
	
	public static WebDriver driver;
	public Properties Config = new Properties();
	public Logger log = Logger.getLogger(BaseTest.class);
	public FileInputStream fis;
	public WebDriverWait wait;
	public static ExcelReader excel = new ExcelReader(".\\excel\\testdata.xlsx");
	
	
	@BeforeClass
	public void setUp() 
	{
	
		PropertyConfigurator.configure(".\\Properties\\log4j.properties");
		log.info("Test Execution has started!!!");
		try {
			fis = new FileInputStream(".\\Properties\\Config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Config.load(fis);
			log.info("Config file has been loaded!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		if (Config.getProperty("browser").equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			log.info("Chrome has been launched!!");
		}else if (Config.getProperty("browser").equals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			log.info("FireFox has been launched!!");
		}
		
		driver.get(Config.getProperty("testsiteurl"));
		log.info("Navigated to: " + Config.getProperty("testsiteurl"));
		driver.manage().window().maximize();
		log.info("Window has been maximized");
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(Config.getProperty("implicit.wait")), TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, Integer.parseInt(Config.getProperty("explicit.wait")));

		
	

}
	@AfterClass
	public void tearDown() {
		
		driver.quit();
		
		
	}
	
}