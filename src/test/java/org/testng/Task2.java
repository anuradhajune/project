package org.testng;

import org.first.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Task2 extends BaseClass {
	@BeforeClass(alwaysRun=true)
	private void browserLaunch() {
		
		loadBrowser();

	}
	@AfterClass(alwaysRun=true)
	public static void closeBrowser() {
		closeCurrentTab();
	}
	@Test(dataProvider="login")
	private void testCase1(String phno) {
		launchUrl("https://www.redbus.in/");
		WebElement log = driver.findElement(By.id("i-icon-profile"));
		moveElement(log);
		btnClk(log);
		WebElement sign = driver.findElement(By.xpath("//li[text()=\"Sign In/Sign Up\"]"));
		moveElement(sign);
		btnClk(sign);
		WebElement login = driver.findElement(By.xpath("//input[@type=\"number\"]"));
		login.sendKeys(phno);
		SoftAssert s=new SoftAssert();
		s.assertTrue(getAtt(login).contains("anu"), "Data is incorrect");

	}
	@DataProvider(name="login")
	private Object[][] data() {
		return new Object[][]{
			{"9841265899"},
			{"1234567"}
			
		};
	

	}
}
