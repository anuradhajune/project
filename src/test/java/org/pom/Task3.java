package org.pom;

import org.first.BaseClass;
import org.first.GreensPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task3 extends BaseClass {
	public static void main(String[] args) {
		loadBrowser();
		launchUrl("http://www.greenstechnologys.com/");
		maxWindow();
		GreensPojo g=new GreensPojo();
		btnClk(g.getCert());
		btnClk(g.getCourse());
		System.out.println("Selenium");
		getTxt(g.getPara());
		moveElement(g.getCou());
		moveElement(g.getJava());
		moveElement(g.getCore());
		elementContextClk(g.getCore());
		scrollDown(g.getScroll());
		getTxt(g.getPrint());
		btnClk(g.getCareer());
		scrollDown(g.getDown());
		getTxt(g.getMailprint());	
previouspage();
btnClk(g.getTestim());
scrollDown(g.getSclldwn());


getlastTxt(g.getTestimoniprint());
previouspage();
btnClk(g.getContact());
getTxt(g.getPp());
scrollDown(g.getDd());
getTxt(g.getCopyright());

		
		
	}

}
