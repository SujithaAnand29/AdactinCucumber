package com.adactin.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver getBrowser(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\user\\eclipse-workspace\\new maven\\AdactinCucumber\\src\\test\\java\\com\\adactin\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();

			} else if (browsername.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\user\\eclipse-workspace\\new maven\\Selenium concepts\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();

			} else {
				System.out.println("Invalid Browsername");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}
	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	public static void waitforElementVisibility(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void inputValuestoElement(WebElement element, String value) {
		waitforElementVisibility(element);
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void clickOnElement(WebElement element) {
		waitforElementVisibility(element);
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void selectDropDown(WebElement element, String value, String option) {
		//waitforElementVisibility(element);
		try {
			Select s = new Select(element);
			if (option.equalsIgnoreCase("Value")) {
				s.selectByValue(value);
			} else if (option.equalsIgnoreCase("visibletext")) {
				s.selectByVisibleText(value);
			} else if (option.equalsIgnoreCase("index")) {
				s.selectByIndex(Integer.parseInt(value));
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}
	
	public static void moveToElement(WebElement element) {
		waitforElementVisibility(element);
		try {
			org.openqa.selenium.interactions.Actions ac=new org.openqa.selenium.interactions.Actions(driver);
			ac.moveToElement(element).perform();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public static void getScreenshot(String filename) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		File desFile=new File(System.getProperty("user.dir")+"\\Screenshot\\"+filename+".png");
		FileUtils.copyFile(srcFile, desFile);
		
	}

}
