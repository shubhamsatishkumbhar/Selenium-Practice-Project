package com.wipro.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotsWork {
	WebDriver driver;
	
	public ScreenshotsWork(WebDriver driver) {
		this.driver=driver;
	}
	public void RegisterScreenshots(String fileName) throws IOException {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\Shubham Kumbhar\\eclipse-workspace\\Selenium-L2-Assignments\\src\\Screenshots\\RegistrationPage\\"+fileName+".jpg"));
	}
	public void AccountScreenshots(String fileName) throws IOException {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\Shubham Kumbhar\\eclipse-workspace\\Selenium-L2-Assignments\\src\\Screenshots\\LoginAccountPage\\"+fileName+".jpg"));
	}
	public void CartPageScreenshots(String fileName) throws IOException {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\Shubham Kumbhar\\eclipse-workspace\\Selenium-L2-Assignments\\src\\Screenshots\\CartPage(Sunglass)\\"+fileName+".jpg"));
	}
	public void CartPage1Screenshots(String fileName) throws IOException {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\Shubham Kumbhar\\eclipse-workspace\\Selenium-L2-Assignments\\src\\Screenshots\\CartPage(Sandals)\\"+fileName+".jpg"));
	}
}
