package com.fly.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//a[text()='New Article']")
	WebElement newArticle;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickNewArticle() {
		newArticle.click();
	}
}
