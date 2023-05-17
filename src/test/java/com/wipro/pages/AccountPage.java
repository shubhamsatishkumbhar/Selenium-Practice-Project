package com.wipro.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {
  WebDriver driver;
  
  public AccountPage(WebDriver driver) {
	  this.driver = driver;
  }
  By AccDetail = By.linkText("Account details");
  By displayName = By.id("account_display_name");
  By saveBtn = By.name("save_account_details");
  
  public void clickAccoutDetails() {
	  driver.findElement(AccDetail).click();
  }
  public void enterDisplayName(String disName) {
	  driver.findElement(displayName).clear();
	  driver.findElement(displayName).sendKeys(disName);
  }
  public void clicSave() {
	  driver.findElement(saveBtn).click();
  }
}
