package com.comcast.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver = null;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Organizations")
	WebElement orhLink;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	WebElement logOutBtn;
	
	@FindBy(linkText = "Sign Out")
	WebElement logOutLink;

	public WebElement getOrhLink() {
		return orhLink;
	}

	public WebElement getLogOutBtn() {
		return logOutBtn;
	}

	public WebElement getLogOutLink() {
		return logOutLink;
	}
	
	

}
