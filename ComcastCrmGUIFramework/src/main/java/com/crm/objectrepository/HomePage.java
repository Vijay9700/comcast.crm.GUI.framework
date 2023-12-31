package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Organizations")
	private WebElement organizationLink;

	public WebElement getOrganizationLink() {
		return organizationLink;
	}
	
	@FindBy(linkText = "Contacts")
	private WebElement contactsLink;

	public WebElement getContactsLink() {
		return contactsLink;
	}

}
