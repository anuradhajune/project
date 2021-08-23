package org.first;




import java.io.IOException;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Task3 extends BaseClass {
	@BeforeClass
	private void loadbrowser() {
		loadBrowser();
		
		//System.out.println("1");

	}
	@AfterClass
	private void quitbro() {
		closeBrowser();
		//System.out.println("2");

	}
	@BeforeMethod
	private void startTime() {
		dateAndTime();

	}
	@AfterMethod
	private void endTime() {
		dateAndTime();

		
	}
	@Test(enabled =false)
	
	public void testCase1() throws IOException, InterruptedException {
		//System.out.println("2");
		launchUrl("https://en-gb.facebook.com/");
		LoginPagePojo g=new LoginPagePojo();
		fillTextbox(g.getTxtuser(), getExcelData(1, 0));
       fillTextbox(g.getTxtpwd(), getExcelData(1, 1));
       btnClk(g.getBtnlgn());
       Thread.sleep(2000);
	}
	//valid username and invalid password
			@Test(priority=-15)
			public void testCase2() throws IOException, InterruptedException {
				launchUrl("https://en-gb.facebook.com/");
				LoginPagePojo g=new LoginPagePojo();
				fillTextbox(g.getTxtuser(), getExcelData(2, 0));
		       fillTextbox(g.getTxtpwd(), getExcelData(2, 1));
		       btnClk(g.getBtnlgn());
		       Thread.sleep(2000);
			}
			//invalid username and valid password
			@Test(invocationCount=5)
			public void testCase3() throws IOException, InterruptedException {
				launchUrl("https://en-gb.facebook.com/");
				LoginPagePojo g=new LoginPagePojo();
				fillTextbox(g.getTxtuser(), getExcelData(3, 0));
		       fillTextbox(g.getTxtpwd(), getExcelData(3, 1));
		       btnClk(g.getBtnlgn());
		       Thread.sleep(2000);
			}
			//valid username and valid password
			@Test
			public void testCase4() throws IOException, InterruptedException {
				launchUrl("https://en-gb.facebook.com/");
				LoginPagePojo g=new LoginPagePojo();
				fillTextbox(g.getTxtuser(), getExcelData(4, 0));
		       fillTextbox(g.getTxtpwd(), getExcelData(4, 1));
		       btnClk(g.getBtnlgn());
		       Thread.sleep(2000);
			}
		
	

}
