package com.wipro.testbase;


import org.testng.annotations.BeforeSuite;

import com.wipro.pages.AccountPage;
import com.wipro.pages.CartPage;
import com.wipro.pages.CartPage1;
import com.wipro.pages.RegistrationPage;
import com.wipro.utilities.ScreenshotsWork;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class Initialization {
	protected WebDriver driver;
	protected AccountPage ObjAccountPage;
	protected CartPage ObjCartPage;
	protected CartPage1 ObjCartPage1;
	public RegistrationPage ObjRegistrationPage;
	public ScreenshotsWork ScreenShot;
	
  @BeforeSuite
  public void beforeSuite() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://shop.demoqa.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.linkText("Dismiss")).click();	  
	  
  }

  @AfterSuite
  public void afterSuite() {
	  driver.close();
  }

}
