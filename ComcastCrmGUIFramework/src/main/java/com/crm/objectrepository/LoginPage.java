package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "user_name")
	private WebElement usernameTextfield;

	public WebElement getUsernameTextfield() {
		return usernameTextfield;
	}

	@FindBy(name = "user_password")
	private WebElement passwordTextfield;

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}
	
	@FindBy(xpath = "(//input[@value='Login'])[2]")
	private WebElement loginButton;

}
