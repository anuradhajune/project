package org.datadriven;

import java.io.IOException;

import org.first.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task5 extends BaseClass {
	public static void main(String[] args) throws IOException {
		loadBrowser();
		launchUrl("https://www.facebook.com");
		maxWindow();
		WebElement email = driver.findElement(By.id("email"));
		WebElement pwd = driver.findElement(By.id("pass"));
		fillTextbox(email, getExcelData(1, 0));
		fillTextbox(pwd, getExcelData(1, 1));
	}
	

}
