package org.datadriven;

import java.io.IOException;

import org.first.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task6 extends BaseClass{
	public static void main(String[] args) throws IOException {
		loadBrowser();
		launchUrl("https://en-gb.facebook.com/");
		maxWindow();
		WebElement email = driver.findElement(By.id("email"));
		WebElement pwd = driver.findElement(By.id("pass"));
		fillTextbox(email, getExcelData(1, 0));
		fillTextbox(pwd, getExcelData(1, 1));
		WebElement btn = driver.findElement(By.name("login"));
		btnClk(btn);
		WebElement error = driver.findElement(By.xpath("//div[contains(text(),\"incorrect\")]"));
	
	
	updateExcel(getTxt(error));
	
	
	}
	
}
