package org.ju;



import java.io.IOException;
import java.util.Date;

import org.first.BaseClass;
import org.first.LoginPagePojo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Task extends BaseClass {
	@BeforeClass
	public static void browserLaunch() {
		
		loadBrowser();

	}
	@Before
	public void startTime() {
		Date d=new Date();
		System.out.println(d);

	}
	@After
	public void endtime() {
		Date d=new Date();
		System.out.println(d);

	}
	@AfterClass
	public static void closeBrowser() {
		closeCurrentTab();
	}
	//invalid username and invalid password
	@Test
	public void testCase1() throws IOException {
		launchUrl("https://en-gb.facebook.com/");
		LoginPagePojo g=new LoginPagePojo();
		fillTextbox(g.getTxtuser(), getExcelData(1, 0));
       fillTextbox(g.getTxtpwd(), getExcelData(1, 1));
       btnClk(g.getBtnlgn());
	}
	//valid username and invalid password
		@Test
		public void testCase2() throws IOException {
			launchUrl("https://en-gb.facebook.com/");
			LoginPagePojo g=new LoginPagePojo();
			fillTextbox(g.getTxtuser(), getExcelData(2, 0));
	       fillTextbox(g.getTxtpwd(), getExcelData(2, 1));
	       btnClk(g.getBtnlgn());
		}
		//invalid username and valid password
		@Test
		public void testCase3() throws IOException {
			launchUrl("https://en-gb.facebook.com/");
			LoginPagePojo g=new LoginPagePojo();
			fillTextbox(g.getTxtuser(), getExcelData(3, 0));
	       fillTextbox(g.getTxtpwd(), getExcelData(3, 1));
	       btnClk(g.getBtnlgn());
		}
		//valid username and valid password
		@Test
		public void testCase4() throws IOException {
			launchUrl("https://en-gb.facebook.com/");
			LoginPagePojo g=new LoginPagePojo();
			fillTextbox(g.getTxtuser(), getExcelData(4, 0));
	       fillTextbox(g.getTxtpwd(), getExcelData(4, 1));
	       btnClk(g.getBtnlgn());
		}
		
		
		

	
	

}
