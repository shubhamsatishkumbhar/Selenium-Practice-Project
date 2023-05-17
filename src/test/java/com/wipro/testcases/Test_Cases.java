package com.wipro.testcases;

//import java.io.File;
import java.io.IOException;
//import java.util.concurrent.TimeUnit;

//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wipro.pages.AccountPage;
import com.wipro.pages.CartPage;
import com.wipro.pages.CartPage1;
import com.wipro.pages.RegistrationPage;
import com.wipro.utilities.*;
import com.wipro.testbase.Initialization;

public class Test_Cases extends Initialization {
	
	
	ExcelWorking excel= new ExcelWorking();
	
	
	
 @Test(dataProvider="registrationTest",priority=1)
  public void RegisterTest(String user, String emailid, String passd) throws IOException {
	  ObjRegistrationPage = new RegistrationPage(driver);
	  ScreenShot = new ScreenshotsWork(driver);
	  
	  ObjRegistrationPage.clickMyAccount();
	  //ObjRegistrationPage.enterUsername(user);
	  //ObjRegistrationPage.enterEmail(emailid);
	  //ObjRegistrationPage.enterPassword(passd);
	  //ObjRegistrationPage.clickRegister();
	  
	  ScreenShot.RegisterScreenshots("Register");
	  
	  ObjRegistrationPage.enterLoginUser(user);
	  ObjRegistrationPage.enterLoginPass(passd);
	  ObjRegistrationPage.clickLogin();
	  
	  ScreenShot.RegisterScreenshots("Login");
	  
	  ObjRegistrationPage.clickLogout();
	  
	  ScreenShot.RegisterScreenshots("Logout");
	  
  }
 @Test(dataProvider="accDetailsTest",priority=2)
  public void AccountPageTest(String user,String passd, String display) throws IOException {
	  ObjRegistrationPage = new RegistrationPage(driver);
	  ObjAccountPage = new AccountPage(driver);
	  
	  ObjRegistrationPage.clickMyAccount();
	  ObjRegistrationPage.enterLoginUser(user);
	  ObjRegistrationPage.enterLoginPass(passd);
	  ObjRegistrationPage.clickLogin();
	  
	  ScreenShot.AccountScreenshots("Login");
	  
	  ObjAccountPage.clickAccoutDetails();
	  
	  ScreenShot.AccountScreenshots("AccountDetail");
	  
	  ObjAccountPage.enterDisplayName(display);
	  
	  ScreenShot.AccountScreenshots("DisplayName");
	  
	  ObjAccountPage.clicSave();
	  
	  ScreenShot.AccountScreenshots("SaveChanges");
	  
	  ObjRegistrationPage.clickLogout();
	  
  }
  @Test(dataProvider="cartPageTest", priority=3)
  public void CartPageTest(String user,String pass,String product,String first,String last,String company,String street,String apartment,String city,String pin, String email,String comment) throws IOException{
	  ObjRegistrationPage = new RegistrationPage(driver);
	  ObjCartPage = new CartPage(driver);
	  
	  ObjRegistrationPage.clickMyAccount();
	  ObjRegistrationPage.enterLoginUser(user);
	  ObjRegistrationPage.enterLoginPass(pass);
	  ObjRegistrationPage.clickLogin();
	  
	  ScreenShot.CartPageScreenshots("Login");
	  
	  ObjCartPage.ClicksearchBtn();
	  
	  ScreenShot.CartPageScreenshots("search");
	  
	  ObjCartPage.Search(product);
	  
	  ScreenShot.CartPageScreenshots("SunglassSearch");
	  
	  ObjCartPage.enterSunglass();
	  ObjCartPage.sunglassColor();
	  ObjCartPage.sunglassSize();
	  ObjCartPage.addtoCart();
	  
	  ScreenShot.CartPageScreenshots("AddToCart");
	  
	  ObjCartPage.clickCart();
	  ObjCartPage.clickCheckout();
	  
	  ObjCartPage.firstName(first);
	  ObjCartPage.lastName(last);
	  ObjCartPage.companyName(company);
	 // ObjCartPage.countryName();
	  ObjCartPage.streetName(street);
	  ObjCartPage.apartmentName(apartment);
	  ObjCartPage.cityName(city);
	 // ObjCartPage.stateName();
	  ObjCartPage.pinNum(pin);
	  ObjCartPage.emailName(email);
	  ObjCartPage.commentText(comment);
	  
	  ScreenShot.CartPageScreenshots("Details");
	  
	  ObjCartPage.acceptTerm();
	  ObjCartPage.placeOrder();
	  
	  ScreenShot.CartPageScreenshots("OrderPlace");
	  //One case is remaining
	  
	  ObjRegistrationPage.clickMyAccount();
	  ObjRegistrationPage.clickLogout();	  
	  
  }
  @Test(dataProvider="cartPage1Test",priority=4)
  public void CartPage1Test(String user, String pass, String product) throws IOException, InterruptedException {
	  ObjRegistrationPage = new RegistrationPage(driver);
	  ObjCartPage1 = new CartPage1(driver);
	  ObjCartPage = new CartPage(driver);
	  ScreenShot = new ScreenshotsWork(driver);
	  
	  ObjRegistrationPage.clickMyAccount();
	  ObjRegistrationPage.enterLoginUser(user);
	  ObjRegistrationPage.enterLoginPass(pass);
	  ObjRegistrationPage.clickLogin();
	  
	  ScreenShot.CartPage1Screenshots("Login");
	  
	  ObjCartPage.ClicksearchBtn();
	  
	  ScreenShot.CartPage1Screenshots("search");
	  
	  ObjCartPage.Search(product);
	  
	  ScreenShot.CartPage1Screenshots("SandalSearch");
	  
	  ObjCartPage1.clickSandal();
	  ObjCartPage1.clickwish();
	  
	  ScreenShot.CartPage1Screenshots("Wish_Icon");
	  
	  ObjCartPage1.clickwishlist();
	  ScreenShot.CartPage1Screenshots("WishList");
	  
	  ObjRegistrationPage.clickMyAccount();
	  ObjRegistrationPage.clickLogout();
	  
	  
  }
  @DataProvider(name="registrationTest")
  public Object[][]  getData() {
		String excelPath = "C:\\Users\\Shubham Kumbhar\\eclipse-workspace\\Selenium-L2-Assignments\\src\\testdata\\ExcelData.xlsx";
		Object data[][] = excel.registrationTest(excelPath,"Sheet1");
		return data;
	}
  @DataProvider(name="accDetailsTest")
  public Object[][] getData1(){
	  String excelPath = "C:\\Users\\Shubham Kumbhar\\eclipse-workspace\\Selenium-L2-Assignments\\src\\testdata\\ExcelData.xlsx";
	  Object[][] data = excel.accDetailsTest(excelPath,"Sheet2");
	  return data;
  }
  @DataProvider(name="cartPageTest")
	public Object[][]getData2() {
	String excelPath = "C:\\Users\\Shubham Kumbhar\\eclipse-workspace\\Selenium-L2-Assignments\\src\\testdata\\ExcelData.xlsx";
	Object[][] data = excel.cartPageTest(excelPath,"Sheet3");
	return data;
  }
  @DataProvider(name="cartPage1Test")
	public Object[][]getData3() {
		String excelPath = "C:\\Users\\Shubham Kumbhar\\eclipse-workspace\\Selenium-L2-Assignments\\src\\testdata\\ExcelData.xlsx";
		Object[][] data = excel.cartPage1Test(excelPath,"Sheet4");
		return data;
	}
}
