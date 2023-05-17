package com.wipro.pages;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CartPage {
  WebDriver driver;
  
  public CartPage(WebDriver driver) {
	  this.driver = driver; 
	  
  }
  By searchBtn = By.className("icon_search");
  By search = By.className("form-control");
  By sunglass = By.className("product-one-thumb");
  By prText = By.xpath("//*[@id=\"product-1348\"]/div[1]/div[2]/h1");
  By prPrice = By.xpath("//*[@id=\"product-1348\"]/div[1]/div[2]/p/span/bdi");
  By sColor = By.id("pa_color");
  By sSize = By.id("pa_size");
  By sAdd = By.xpath("//button[@class='single_add_to_cart_button button alt']");
  By rightCart =By.cssSelector(".icon_bag_alt");
  By checkout = By.xpath("//*[@id=\"post-6\"]/div/div/div[2]/div[2]/div/a");
  By fName = By.id("billing_first_name");
  By lName = By.id("billing_last_name");
  By company = By.id("billing_company");
 // By country = By.id("select2-billing_state-container");
  By street = By.id("billing_address_1");
  By apartment =By.id("billing_address_2");
  By city = By.id("billing_city");
 // By state = By.id("select2-billing_state-container");
  By pin = By.id("billing_postcode");
  By email = By.id("billing_email");
  By comment = By.id("order_comments");
  By term = By.xpath("//*[@id=\"terms\"]");
  By order = By.id("place_order");
 
  public void ClicksearchBtn() {
	  driver.findElement(searchBtn).click();
  }
  public void Search(String product) {
	  WebElement sun = driver.findElement(search);
	 
	  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  sun.sendKeys(product);
	  sun.sendKeys(Keys.ENTER);
  }
  public void enterSunglass() throws IOException {
	  driver.findElement(sunglass).click();
	  WebElement tex = driver.findElement(prText);
	  String Text = tex.getText();
	  WebElement pr = driver.findElement(prPrice);
	  
	  String Price= pr.getText();
	  File f = new File("Sunglass.txt");
	  FileWriter fw = new FileWriter(f);
	  fw.write(Text+" : "+Price);
  }
  public void sunglassColor() {
	  Select color = new Select(driver.findElement(sColor));
	  color.selectByIndex(1);
  }
  public void sunglassSize() {
	  Select size = new Select(driver.findElement(sSize));
	  size.selectByIndex(1);
  }
  public void addtoCart() {
	  driver.findElement(sAdd).click();
  }
  public void clickCart() {
	  driver.findElement(rightCart).click();
  }
  public void clickCheckout() {
	  driver.findElement(checkout).click();
  }
  public void firstName(String first) {
	  WebElement f =driver.findElement(fName);
	  f.clear();
	  f.sendKeys(first);
  }
  public void lastName(String last) {
	  WebElement l =driver.findElement(lName);
	  l.clear();
	  l.sendKeys(last);
  }
  public void companyName(String comp) {
	  WebElement c = driver.findElement(company);
	  c.clear();
	  c.sendKeys(comp);
  }
 /* public void countryName() {
	  Select Country = new Select(driver.findElement(country));
	  Country.selectByVisibleText("India");
	  
  }*/
  public void streetName(String str) {
	  WebElement st = driver.findElement(street);
	  st.clear();
	  st.sendKeys(str);
  }
  public void apartmentName(String apar) {
	  WebElement ap = driver.findElement(apartment);
	  ap.clear();
	  ap.sendKeys(apar);
  }
  public void cityName(String cit) {
	  WebElement ci = driver.findElement(city);
	  ci.clear();
	  ci.sendKeys(cit);
  }
  /*public void stateName() {
	  Select state =  new Select(driver.findElement(By.id("select2-billing_state-container")));
	  state.selectByVisibleText("Maharashtra");
  }*/
  public void pinNum(String post) {
	 WebElement pi =  driver.findElement(pin);
	 pi.clear();
	 pi.sendKeys(post);
  }
  public void emailName(String id) {
	  WebElement i = driver.findElement(email);
	  i.clear();
	  i.sendKeys(id);
  }
  public void commentText(String comm) {
	  WebElement co = driver.findElement(comment);
	  co.clear();
	  co.sendKeys(comm);  
	  
  }
  public void acceptTerm() {
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,-300)");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  WebElement check = driver.findElement(term);
	  check.click();
	  /*Actions action = new Actions(driver);
	  action.moveToElement(check).click().build().perform();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  System.out.println("Done");*/
	  
  }
  public void placeOrder() {
	  WebElement place = driver.findElement(order);
	  place.click();
	  /*Actions action1 = new Actions(driver);
	  action1.moveToElement(place).click().perform();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  System.out.println("Complete");*/
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,-300)");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
  }
}
