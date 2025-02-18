package com.comcast.crm.webdriverutility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
	
	public void getMaximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public void waitTillPageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void selectOptionFromDropDown(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	
	public void selectOptionFromDropDown(WebElement element, int value) {
		Select sel = new Select(element);
		sel.selectByIndex(value);
	}
	
	public void switchToWindowByPartialURL(WebDriver driver, String partialUrl) {
		Set<String> windowID = driver.getWindowHandles();
		for (String ID : windowID) {
			driver.switchTo().window(ID);
			String currentUrl = driver.getCurrentUrl();
			if(currentUrl.contains(partialUrl)) {
				break;
			}
		}
	}
	
	public void moveToAnElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
}
