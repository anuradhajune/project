package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task2 {
	public static void main(String[] args) throws IOException {
		File f= new File("C:\\Users\\raja_\\eclipse-workspace\\Mavenfirst\\sheet\\Book2.xlsx");
	FileInputStream f1=new FileInputStream(f);
	Workbook v=new XSSFWorkbook(f1);
	Sheet s = v.getSheet("Sheet1");
	int a = s.getPhysicalNumberOfRows();
	for (int i = 0; i <a ; i++) {
		Row r = s.getRow(i);
		int d = r.getPhysicalNumberOfCells();
		for (int j = 0; j < d; j++) {
			Cell cell = r.getCell(j);
			System.out.println(cell);
		}
		
	}
	
	}


}
