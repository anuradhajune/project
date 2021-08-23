package org.datadriven;

import java.io.IOException;

import org.first.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task8 extends BaseClass {
	public static void main(String[] args) throws IOException {
		loadBrowser();
		launchUrl("https://my.naukri.com/account/register/basicdetails");
		maxWindow();
		WebElement btn = driver.findElement(By.name("userType"));
		btnClk(btn);
		WebElement fname = driver.findElement(By.id("fname"));
		fillTextbox(fname, getExcelData(1, 0));
		WebElement email = driver.findElement(By.id("email"));
		fillTextbox(email, getExcelData(1, 1));
		
		WebElement pwd = driver.findElement(By.name("password"));
		fillTextbox(pwd, getExcelData(1, 2));
		WebElement phone = driver.findElement(By.name("number"));
		fillTextbox(phone, getExcelData(1, 3));
		WebElement city = driver.findElement(By.xpath("//input[@class=\"sugInp\"]"));
		fillTextbox(city, getExcelData(1, 4));
		
		
		
	}

}
