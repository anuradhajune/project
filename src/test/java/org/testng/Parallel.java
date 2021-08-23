package org.testng;

import java.io.IOException;

import org.first.BaseClass;
import org.first.LoginPagePojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel extends BaseClass{
	
	
@Parameters({"test1"})
	@Test
	
	public void testCase1(@Optional("green")String op) throws IOException, InterruptedException {
		//System.out.println("2");
	loadBrowser();
		launchUrl("https://en-gb.facebook.com/");
		
		LoginPagePojo g=new LoginPagePojo();
		fillTextbox(g.getTxtuser(), getExcelData(1, 0));
       fillTextbox(g.getTxtpwd(), getExcelData(1, 1));
       btnClk(g.getBtnlgn());
       System.out.println(op +"TC1"+ Thread.currentThread().getId());
       Thread.sleep(2000);
       closeBrowser();
	}
	//valid username and invalid password
@Parameters({"test2"})
			@Test
			public void testCase2(@Optional("yellow")String lop) throws IOException, InterruptedException {
				loadBrowser();
	launchUrl("https://en-gb.facebook.com/");
				
				LoginPagePojo g=new LoginPagePojo();
				fillTextbox(g.getTxtuser(), getExcelData(2, 0));
		       fillTextbox(g.getTxtpwd(), getExcelData(2, 1));
		       btnClk(g.getBtnlgn());
		       System.out.println(lop+"TC2"+ Thread.currentThread().getId());
		       Thread.sleep(2000);
		       closeBrowser();
			}
			//invalid username and valid password
@Parameters({"test3"})
			@Test
			public void testCase3(@Optional("pink")String cop) throws IOException, InterruptedException {
				loadBrowser();
	launchUrl("https://en-gb.facebook.com/");
				
				LoginPagePojo g=new LoginPagePojo();
				fillTextbox(g.getTxtuser(), getExcelData(3, 0));
		       fillTextbox(g.getTxtpwd(), getExcelData(3, 1));
		       btnClk(g.getBtnlgn());
		       System.out.println(cop+"TC3"+ Thread.currentThread().getId());
		       Thread.sleep(2000);
		       closeBrowser();
			}
			//valid username and valid password
@Parameters({"test4"})
			@Test
			public void testCase4(@Optional("blue") String gop) throws IOException, InterruptedException {
				loadBrowser();
	launchUrl("https://en-gb.facebook.com/");
				
				LoginPagePojo g=new LoginPagePojo();
				fillTextbox(g.getTxtuser(), getExcelData(4, 0));
		       fillTextbox(g.getTxtpwd(), getExcelData(4, 1));
		       btnClk(g.getBtnlgn());
		       System.out.println(gop+"TC4"+ Thread.currentThread().getId());
		       Thread.sleep(2000);
		       closeBrowser();
			}
		
	



}
