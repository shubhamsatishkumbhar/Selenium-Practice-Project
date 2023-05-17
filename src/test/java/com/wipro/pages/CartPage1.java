package com.wipro.pages;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage1 {
	WebDriver driver;
	
	public CartPage1(WebDriver driver) {
		this.driver = driver;
	}
	By sandal = By.xpath("//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[2]/div/h3/a");
	By prText = By.xpath("//*[@id=\"product-1306\"]/div[1]/div[2]/h1");
	By prPrice = By.xpath("//*[@id=\"product-1306\"]/div[1]/div[2]/p/span/bdi");
	By wish = By.xpath("//*[@id=\"product-1306\"]/div[1]/div[2]/div[2]/div");
	By wishlist = By.xpath("//*[@id=\"noo-site\"]/header/div[1]/div/ul[2]/li[1]/a");
	
	public void clickSandal() throws IOException {
		driver.findElement(sandal).click();
		 WebElement tex = driver.findElement(prText);
		 String Text = tex.getText();
		 WebElement pr = driver.findElement(prPrice);
		 String Price= pr.getText();
		
		 //System.out.println("We Get: "+Text+" :"+Price);
		 File f = new File("Sandals.txt");
		 FileWriter fw = new FileWriter(f);
		 fw.write(Text+" : "+Price);
		 System.out.println("Cleared");
	}
	public void clickwish() throws InterruptedException {
		//Thread.sleep(15);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(wish).click();
		System.out.println("Cleared1");
	}
	public void clickwishlist() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,-500)");
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(
		ExpectedConditions.visibilityOfElementLocated(By.id("wishlist")));*/
		driver.findElement(wishlist).click();
	}
}
