package org.first;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreensPojo extends BaseClass {
	public GreensPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Certifications']")
	private WebElement cert;
	@FindBy(xpath="(//a[text()='Course Content'])[40]")
	private WebElement course;
	@FindBy(xpath="//p[contains(text(),'Dinesh')]")
	private WebElement para;
	@FindBy(xpath="//a[text()='COURSES']")
	private WebElement cou;
	@FindBy(xpath="//a[text()='Java Training ']")
	private WebElement java;
	@FindBy(xpath="//a[text()='Core Java Training']")
	private WebElement core;
	@FindBy(xpath="//h2[text()='Best Java training in Chennai Reviews from Chetan']")
	private WebElement scroll;
	@FindBy(xpath="//h2[text()='Java training Reviews from Anitha']")
	private WebElement print;
	@FindBy(xpath="//b[text()='About Instructor:']")
	private WebElement scrollup;
	@FindBy(xpath="//a[text()='CAREERS']")
	private WebElement career;
	@FindBy (xpath="(//h6[text()='Greens Technology '])[4]")
	private WebElement down;
	@FindBy(xpath="(//a[text()='contact@greenstechnologys.com'])[8]")
	private WebElement mailprint;
	@FindBy(xpath="//a[text()='TESTIMONIALS']")
	private WebElement testim;
	@FindBy(xpath="//a[text()='+91 8939 915 577 ']")
	private WebElement phoneprint;
	@FindBy(xpath="(//div[@class='testimonial-section'])[18]")
	private WebElement sclldwn;
	@FindBy(xpath="(//div[@class='testimonial-section'])[19]")
	private WebElement testimoniprint;
	@FindBy (xpath="//a[text()='CONTACT US']")
	private WebElement contact;
	@FindBy (xpath="//h3[text()='Our Main Branches In Chennai ']")
	private WebElement pp;
	@FindBy (xpath="(//li[text()='contact@greenstechnologys.com'])[6]")
	private WebElement dd;
	@FindBy (xpath="//p[text()='Copyright © 2018 Greens Technology. All rights reserved.']")
	private WebElement copyright;
	public WebElement getContact() {
		return contact;
	}
	public WebElement getPp() {
		return pp;
	}
	public WebElement getDd() {
		return dd;
	}
	public WebElement getCopyright() {
		return copyright;
	}
	public WebElement getTestim() {
		return testim;
	}
	public WebElement getPhoneprint() {
		return phoneprint;
	}
	public WebElement getSclldwn() {
		return sclldwn;
	}
	public WebElement getTestimoniprint() {
		return testimoniprint;
	}
	public WebElement getScrollup() {
		return scrollup;
	}
	public WebElement getCareer() {
		return career;
	}
	public WebElement getDown() {
		return down;
	}
	public WebElement getMailprint() {
		return mailprint;
	}
	public WebElement getCou() {
		return cou;
	}
	public WebElement getJava() {
		return java;
	}
	public WebElement getCore() {
		return core;
	}
	public WebElement getScroll() {
		return scroll;
	}
	public WebElement getPrint() {
		return print;
	}
	public WebElement getCert() {
		return cert;
	}
	public WebElement getCourse() {
		return course;
	}
	public WebElement getPara() {
		return para;
	}
	

}
