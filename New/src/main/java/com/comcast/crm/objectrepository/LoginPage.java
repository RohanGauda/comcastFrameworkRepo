package com.comcast.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.fileutility.FileUtility;

public class LoginPage {
	
	WebDriver driver = null;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "user_name")
	private WebElement username;
	
	@FindBy(name = "user_password")
	private WebElement password;
	
	@FindBy(id = "submitButton")
	private WebElement submitBtn;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	
	public void loginIntoApp() throws Throwable {
		FileUtility fu = new FileUtility();
		String un = fu.getFileUtility("username");
		String pwd = fu.getFileUtility("password");
		username.sendKeys(un);
		password.sendKeys(pwd);
		submitBtn.click();
	}
	
}
