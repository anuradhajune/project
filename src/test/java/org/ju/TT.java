package org.ju;

import java.io.IOException;

import org.first.BaseClass;
import org.first.LoginPagePojo;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TT extends BaseClass {
	
	@BeforeClass
	private void browser() {
		System.out.println("a");
		loadBrowser();
		

	}
	@Parameters({"username","password"}) 
	@Test
	public void testCase3(String name,String pwd) throws IOException {
		launchUrl("https://en-gb.facebook.com/");
		System.out.println("s");
		LoginPagePojo g=new LoginPagePojo();
		fillTextbox(g.getTxtuser(), name);
      fillTextbox(g.getTxtpwd(), pwd);
       btnClk(g.getBtnlgn());
	}
	

}
