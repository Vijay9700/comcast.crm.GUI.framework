package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContactsPage {
	
	public CreateNewContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "lastname")
	private WebElement lastnameTextfield;

	public WebElement getLastnameTextfield() {
		return lastnameTextfield;
	}
	
	@FindBy(xpath = "(//img[@title='Select'])[1]")
	private WebElement OrganizationSelecticon;

	public WebElement getOrganizationSelecticon() {
		return OrganizationSelecticon;
	}

}
