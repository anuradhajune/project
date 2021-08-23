package org.testng;

import java.io.IOException;

import org.first.BaseClass;
import org.first.LoginPagePojo;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class browser extends BaseClass{
	@Parameters({"browser"})
	@BeforeClass
	private void tc1(String name) throws IOException, InterruptedException {
		if (name.equals("ff")) {
			openFirefox();
			
			
			
		}
		else if (name.equals("chrome")) {
			loadBrowser();
			
			
		}
		else {
			openedge();			
			
		}
		
	
	}
	@Test(retryAnalyzer=Failed.class)
	private void tc2() throws IOException {
		maxWindow();
		
		launchUrl("https://en-gb.facebook.com/");


	
		LoginPagePojo g=new LoginPagePojo();
		fillTextbox(g.getTxtuser(), getExcelData(1, 0));   
		fillTextbox(g.getTxtpwd(), getExcelData(1, 1));
       btnClk(g.getBtnlgn());
	

	}	

}
