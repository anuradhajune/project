package org.pom;

import java.io.IOException;

import org.first.BaseClass;
import org.first.LoginPagePojo;

public class Task1 extends BaseClass {
	public static void main(String[] args) throws IOException {
		loadBrowser();
		launchUrl("https://en-gb.facebook.com/");
		maxWindow();
		LoginPagePojo p= new LoginPagePojo();
		fillTextbox(p.getTxtuser(), getExcelData(1, 0));
		fillTextbox(p.getTxtpwd(), getExcelData(1, 1));
		btnClk(p.getBtnlgn());
	}

}
