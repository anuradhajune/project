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

public class Task3 {
	public static void main(String[] args) throws IOException {
		File f= new File("C:\\Users\\raja_\\eclipse-workspace\\Mavenfirst\\sheet\\anu.xlsx");
		FileInputStream f1=new FileInputStream(f);
		Workbook book= new XSSFWorkbook(f1);
		Sheet s = book.getSheet("Sheet1");
		Row r = s.createRow(0);
		Cell c = r.createCell(0);
		c.setCellValue("Anu");
		FileOutputStream fout=new FileOutputStream(f);
		book.write(fout);
	}

}
