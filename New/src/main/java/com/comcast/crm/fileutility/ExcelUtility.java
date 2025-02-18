package com.comcast.crm.fileutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	

	public String getReadDataFromExcel(String sheetname,int rowNum, int colNum) throws Throwable {
		FileInputStream fis = new FileInputStream("C:\\Users\\rohan\\AdvSelenium\\New\\testdata\\Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row row = sh.getRow(rowNum);
		Cell cell = row.getCell(colNum);
		String data = cell.toString();
		wb.close();
		return data;
	}
	
	public void getWriteDataToExcel(String sheetname,int rowNum, int colNum, String value) throws Throwable {
		FileInputStream fis = new FileInputStream("C:\\Users\\rohan\\AdvSelenium\\New\\testdata\\Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row row = sh.getRow(rowNum);
		Cell cell = row.createCell(colNum);
		cell.setCellType(CellType.STRING);
		cell.setCellValue(value);
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\rohan\\AdvSelenium\\New\\testdata\\Book1.xlsx");
		wb.write(fos);
		wb.close();
	}
	
	public int getLastRowNum(String sheetname,int rowNum) throws Throwable {
		FileInputStream fis = new FileInputStream("C:\\Users\\rohan\\AdvSelenium\\New\\testdata\\Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		int lastRowNum = sh.getLastRowNum();
		return lastRowNum;
	}

}
