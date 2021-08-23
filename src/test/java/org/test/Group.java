package org.test;

import java.io.IOException;


import org.first.BaseClass;
import org.first.LoginPagePojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Group extends BaseClass {
@BeforeClass(alwaysRun=true)
	private void browserLaunch() {
		
		loadBrowser();

	}
	@AfterClass(alwaysRun=true)
	public static void closeBrowser() {
		closeCurrentTab();
	}
	//invalid username and invalid password
	@Parameters({"username","password"})
	@Test(groups="Smoke")
	public void testCase1(String name,String pwd) throws IOException, InterruptedException {
		
		
		launchUrl("https://en-gb.facebook.com/");
		LoginPagePojo g=new LoginPagePojo();
		fillTextbox(g.getTxtuser(), name);
       fillTextbox(g.getTxtpwd(), pwd);
       btnClk(g.getBtnlgn());
       Thread.sleep(2000);
	}
	//valid username and invalid password
		@Test(groups="Regression")
		public void testCase2() throws IOException, InterruptedException {
			
			launchUrl("https://en-gb.facebook.com/");
			LoginPagePojo g=new LoginPagePojo();
			fillTextbox(g.getTxtuser(), getExcelData(2, 0));
	       fillTextbox(g.getTxtpwd(), getExcelData(2, 1));
	       btnClk(g.getBtnlgn());
	       Thread.sleep(2000);
		}
		//invalid username and valid password
		@Test(groups= {"Sanity","Smoke"})
		public void testCase3() throws IOException, InterruptedException {
			
			launchUrl("https://en-gb.facebook.com/");
			LoginPagePojo g=new LoginPagePojo();
			fillTextbox(g.getTxtuser(), getExcelData(3, 0));
	       fillTextbox(g.getTxtpwd(), getExcelData(3, 1));
	       btnClk(g.getBtnlgn());
	       Thread.sleep(2000);
		}
		//valid username and valid password
		@Test(groups= {"Sanity,Regression"})
		public void testCase4() throws IOException, InterruptedException {
			
			launchUrl("https://en-gb.facebook.com/");
			LoginPagePojo g=new LoginPagePojo();
			fillTextbox(g.getTxtuser(), getExcelData(4, 0));
	       fillTextbox(g.getTxtpwd(), getExcelData(4, 1));
	       btnClk(g.getBtnlgn());
	       Thread.sleep(2000);
		}
		
		
		

	
	

}



