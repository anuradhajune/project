package org.ju;

import java.io.IOException;

import org.first.BaseClass;
import org.first.LoginPagePojo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

public class Task1 extends BaseClass {
	@BeforeClass
	public static void launch() {
		loadBrowser();

	}
	@Test
	public void testCase1() throws IOException {
		launchUrl("https://en-gb.facebook.com/");
		LoginPagePojo g=new LoginPagePojo();
		fillTextbox(g.getTxtuser(), getExcelData(1, 0));
		Assert.assertTrue("username is incorrect", (getAtt(g.getTxtuser()).equals("java")));
       fillTextbox(g.getTxtpwd(), getExcelData(1, 1));
       Assert.assertEquals("password is incorrect", "java", (getAtt(g.getTxtuser())));
       
       btnClk(g.getBtnlgn());
	}
	
	

}
