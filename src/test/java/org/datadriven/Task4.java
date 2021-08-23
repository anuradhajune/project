package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task4 {
	public static void main(String[] args) throws IOException {
		File f= new File("C:\\Users\\raja_\\eclipse-workspace\\Mavenfirst\\sheet\\anu.xlsx");

	Workbook w= new XSSFWorkbook();
	Sheet s = w.createSheet("Hotel");
	Row r = s.createRow(0);
	Cell c1 = r.createCell(1);
	
	Cell c = r.createCell(0);
	c.setCellValue("Anu");
	c1.setCellValue("anu12345");
	FileOutputStream fout=new FileOutputStream(f);
	w.write(fout);
	
	
	}

}
