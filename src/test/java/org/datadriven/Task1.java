package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task1 {
	public static void main(String[] args) throws IOException {
		File f= new File("C:\\Users\\raja_\\eclipse-workspace\\Mavenfirst\\sheet\\Book2.xlsx");
		FileInputStream f1= new FileInputStream(f);
		Workbook book = new XSSFWorkbook(f1);
		Sheet s = book.getSheet("Sheet1");
	int a = s.getPhysicalNumberOfRows();
	System.out.println("The Total number of Rows: "+ a);
		Row r = s.getRow(1);
		int c = r.getPhysicalNumberOfCells();
		System.out.println("The Total number of cells: "+ c);
	}

}
