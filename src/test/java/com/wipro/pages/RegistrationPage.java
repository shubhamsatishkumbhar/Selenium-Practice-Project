package com.wipro.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
	WebDriver driver;
	
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
	}
	By accBtn = By.linkText("My Account");
	By username = By.id("reg_username");
	By email = By.id("reg_email");
	By password = By.id("reg_password");
	By registerBtn = By.name("register");
	By loginBtn = By.name("login");
	By logoutBtn = By.xpath("//*[@id=\"post-8\"]/div/div/nav/ul/li[6]/a");
	By loginUser = By.id("username");
	By loginPass = By.id("password");
	
	public void clickMyAccount() {
		driver.findElement(accBtn).click();
	}
	
	public void enterUsername(String user) {
		driver.findElement(username).sendKeys(user);
	}
	public void enterEmail(String emailId) {
		driver.findElement(email).sendKeys(emailId);
	}
	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	public void clickRegister() {
		driver.findElement(registerBtn).click();	
	}
	public void clickLogin() {
		driver.findElement(loginBtn).click();	
	}
	public void clickLogout() {
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");*/
		driver.findElement(logoutBtn).click();	
	}
	public void enterLoginUser(String User) {
		driver.findElement(loginUser).sendKeys(User);	
	}
	public void enterLoginPass(String Pass) {
		driver.findElement(loginPass).sendKeys(Pass);;	
	}
}
