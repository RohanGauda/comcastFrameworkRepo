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
	private WebElement orhLink;

	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement logOutBtn;
	
	@FindBy(linkText = "Sign Out")
	private WebElement logOutLink;
	
	@FindBy(linkText = "Products")
	private WebElement productLink;

	public WebElement getOrhLink() {
		return orhLink;
	}

	public WebElement getLogOutBtn() {
		return logOutBtn;
	}

	public WebElement getLogOutLink() {
		return logOutLink;
	}
	
	public WebElement getProductLink() {
		return productLink;
	}

}
