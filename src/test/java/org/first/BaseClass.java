package org.first;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static Robot r;
	public static Actions a;
	
	

	public static Select s;
	
	public static void loadBrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	public static void openFirefox() {
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();

	}
	public static void openedge() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();

	}
	public static void closeBrowser() {
		driver.quit();

	}
	public static void maxWindow() {
		driver.manage().window().maximize();

	}
	public static void pagetitle() {
		String pgtitle = driver.getTitle();

	}
	public static void pageUrl() {
		String url = driver.getCurrentUrl();

	}
	public static void launchUrl(String url) {
		driver.get(url);
	}
	
	public static void closeCurrentTab() {
		driver.close();
	}

	public static void fillTextbox(WebElement element,String value) {
		element.sendKeys(value);

	}
	public static String getTxt(WebElement element) {
		String txt = element.getText();
		System.out.println(txt);
		return txt;

	}
	public static String getlastTxt(WebElement element) {
		String txt = element.getText();
		int a = txt.indexOf("This");
		String lastline = txt.substring(a);
		System.out.println(lastline);
		return lastline;

	}

	public static String getAtt(WebElement element) {
	String val = element.getAttribute("value");
	System.out.println(val);
	return val;

	}
	public static void btnClk(WebElement element) {
		element.click();

	}
	public static void copy() throws AWTException {
	 r=new Robot();
	 r.keyPress(KeyEvent.VK_CONTROL);
	 r.keyPress(KeyEvent.VK_C);
	 r.keyRelease(KeyEvent.VK_CONTROL);
	 r.keyRelease(KeyEvent.VK_C);

	}
	public static void paste() throws AWTException {
		r=new Robot();
		 
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_V);
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_V);

	}
	public static void selectAll() throws AWTException {
		r=new Robot();
		 
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_A);
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_A);

	}
	public static void moveElement(WebElement element) {
		a=new Actions(driver);
		a.moveToElement(element).perform();

	}
	public static void dragdrop(WebElement src,WebElement des) {
		a=new Actions(driver);
		
		a.dragAndDrop(src, des).perform();
	}
	public static void contextClk() {
		a=new Actions(driver);
		
		a.contextClick().perform();

	}
	public static void elementContextClk(WebElement element) {
		a=new Actions(driver);
		
	a.click(element).perform();

	}
	public static void doubleClk() {
		a=new Actions(driver);
		
		a.doubleClick().perform();

	}
	public static void elementDoubleClk(WebElement element) {
		a=new Actions(driver);
		
		a.doubleClick(element).perform();

	}
	public static void shiftKyUp() {
		a=new Actions(driver);
		
		a.keyUp(Keys.SHIFT).perform();

	}
	public static void shiftkydwn() {
		a=new Actions(driver);
		
		a.keyDown(Keys.SHIFT).perform();

	}

	public static void alertAccpt() {
		Alert c=driver.switchTo().alert();

		c.accept();		

	}
	public static void alertdismss() {
		Alert c=driver.switchTo().alert();

		c.dismiss();

	}
	public static void alertSendkys(String value) {
		Alert c=driver.switchTo().alert();
c.accept();
		c.sendKeys(value);
	}
	public static void alertgetxt() {
		Alert c=driver.switchTo().alert();
c.accept();
		String txt = c.getText();
		System.out.println(txt);

	}
	public static void scrollDown(WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}
	public static void scrollUp(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(false)", element);

	}
	public static void jsSetAtt(WebElement element,String values) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('value','"+values+"')", element);

	}
	public static void jsGetAtt(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("return arguments[0].getAttribute('value')", element);

	}

	public static void jsclk(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click()", element);

	}
	
	public static  void screenShot(String image) throws IOException {
	 	TakesScreenshot tk=(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File f=new File("C:\\Users\\raja_\\eclipse-workspace\\Mavenfirst\\scrnshot\\"+image+".png");
		Files.copy(src, f);

	}
	public static void frame(WebElement element) {
		driver.switchTo().frame(element);

	}
	public static void parentFrame() {
		driver.switchTo().parentFrame();

	}
	public static void sbyindx(WebElement element,int a) {
		 s=new Select(element);
		s.selectByIndex(a);

	}
	public static void sByTxt(String value, WebElement element) {
		 s=new Select(element);
			
		s.selectByVisibleText(value);

	}
    public static void sByValue(String value, WebElement element) {
    	 s=new Select(element);
 		
		s.selectByValue(value);

	}

    public static void sIsMultiple(WebElement element) {
    	 s=new Select(element);
 		
    	boolean g = s.isMultiple();
    	System.out.println(g);

}
public static void sGetOpt(WebElement element) {
	 s=new Select(element);
		
	List<WebElement> alldata = s.getOptions();
	for (int i = 0; i < alldata.size(); i++) {
		System.out.println(i);
	}
	}
public static void sGetAllSelected(WebElement element) {
	 s=new Select(element);
		
	
List<WebElement> allselected = s.getAllSelectedOptions();
for (int i = 0; i < allselected.size(); i++) {
	System.out.println(i);
}

}
public static void sFirstSelected(WebElement element) {
	 s=new Select(element);
		
	
WebElement firstselect = s.getFirstSelectedOption();
System.out.println(firstselect);
}
public static void sdeselectByI(int j, WebElement element) {
	 s=new Select(element);
		
s.deselectByIndex(j);
}
public static void sdeselectByValue(String value, WebElement element) {
	 s=new Select(element);
		
	s.deselectByValue(value);

}
public static void sdeselectByTxt(String text, WebElement element) {
	 s=new Select(element);
		
	s.deselectByVisibleText(text);	

}
public static void sDeselectall(WebElement element) {
	 s=new Select(element);
		
	
s.deselectAll();

}
public static void previouspage() {
	driver.navigate().back();

}	

public static void moveToWindow() {
	

	String parentid = driver.getWindowHandle();
	Set<String> allwindows = driver.getWindowHandles();
	for (String eachid : allwindows) {
		if (!eachid.equals(parentid)) {
			driver.switchTo().window(eachid);
			
		}
	}

}
public static void windowshandlingmovingbyindex(int z) {
	Set<String> allwindows = driver.getWindowHandles();
List<String>li=new ArrayList<String>();
li.addAll(allwindows);


driver.switchTo().window(li.get(z));
}
public static void frameCount(String tagname) {
	List<WebElement> allFrames = driver.findElements(By.tagName(tagname));
	System.out.println("No of Frames: "+allFrames.size());
}

public static String getExcelData(int rowno,int cellno) throws IOException {
	File f= new File("C:\\Users\\raja_\\eclipse-workspace\\Mavenfirst\\sheet\\fb.xlsx");
	FileInputStream f1= new FileInputStream(f);
	Workbook w=new XSSFWorkbook(f1);
	Sheet s = w.getSheet("Sheet1");
	Row r = s.getRow(rowno);
	Cell c = r.getCell(cellno);
	int a = c.getCellType();
	String va="";
	if (a==1) {
		 va = c.getStringCellValue();
	}
	else if (a==0) {
		if (DateUtil.isCellDateFormatted(c)) {
			Date k = c.getDateCellValue();
			SimpleDateFormat sim=new SimpleDateFormat("mm-dd-yyyy");
			 va = sim.format(k);
		}
		
		
	
	else {
		double d = c.getNumericCellValue();
		long l=(long)d;
		 va = String.valueOf(l);
	}
	}
	return va;
}
public static void updateExcel(String a) throws IOException {
	File f= new File("C:\\Users\\raja_\\eclipse-workspace\\Mavenfirst\\sheet\\fb.xlsx");
FileInputStream f1=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(f1);
	Sheet s = w.getSheet("Sheet1");
	Row r = s.getRow(1);
	Cell c = r.createCell(2);
	c.setCellValue(a);
	FileOutputStream fout=new FileOutputStream(f);
	w.write(fout);



}
public static void impWait() {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
public static void alertWait() {
	WebDriverWait w= new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.alertIsPresent());
		Alert c =driver.switchTo().alert();
		c.accept();
}
public static void elementWait(WebElement element) {
	WebDriverWait w= new WebDriverWait(driver, 10);
	w.until(ExpectedConditions.visibilityOf(element));

}
public static void eleClkWait(WebElement element) {
	WebDriverWait w= new WebDriverWait(driver, 10);
	w.until(ExpectedConditions.elementToBeClickable(element));
}
public static void elementSelState(WebElement element) {
	WebDriverWait w= new WebDriverWait(driver, 10);
	w.until(ExpectedConditions.elementSelectionStateToBe(element, true));	

}
public static void eleToBeSel(WebElement element) {
	WebDriverWait w= new WebDriverWait(driver, 10);
	w.until(ExpectedConditions.elementToBeSelected(element));

}
public static void waitFrame(WebElement element) {
	WebDriverWait w= new WebDriverWait(driver, 10);
	w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));

}
public static void waitinvi(WebElement element) {
	WebDriverWait w= new WebDriverWait(driver, 10);
	w.until(ExpectedConditions.invisibilityOf(element));

}
public static void waitinvitxt(String g,String txt) {
	WebDriverWait w= new WebDriverWait(driver, 10);
	w.until(ExpectedConditions.invisibilityOfElementWithText(By.id(g), txt));

}

public static void waitpresenceOfElement(WebElement webElement) {
	WebDriverWait w= new WebDriverWait(driver, 10);
	w.until(ExpectedConditions.presenceOfElementLocated(By.id(webElement)));

}
public static  void fluentWait() {
	
	Wait w=new FluentWait(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(300,TimeUnit.MILLISECONDS).ignoring(Throwable.class);
w.until(ExpectedConditions.alertIsPresent());
}
public static void dateAndTime() {
	Date d=new Date();
	System.out.println(d);

}















	
	

}
