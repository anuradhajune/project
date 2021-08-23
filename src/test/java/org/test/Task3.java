package org.test;

import org.first.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task3 extends BaseClass{
	public static void main(String[] args) {
		loadBrowser();
		launchUrl("http://www.greenstechnologys.com/");
		maxWindow();
		WebElement certification = driver.findElement(By.xpath("//a[text()='Certifications']"));
		btnClk(certification);
		WebElement course = driver.findElement(By.xpath("(//a[text()='Course Content'])[40]"));
		btnClk(course);
		WebElement para = driver.findElement(By.xpath("//p[contains(text(),'Dinesh')]"));
		System.out.println("Selenium");
		getTxt(para);
		WebElement clk = driver.findElement(By.xpath("//a[text()='COURSES']"));
		moveElement(clk);
		elementContextClk(clk);
		WebElement java = driver.findElement(By.xpath("//a[text()='Java Training ']"));
		moveElement(java);
		elementContextClk(java);
	}

}
