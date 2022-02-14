package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriven_write {
	
	public static void write_data() throws Throwable
	{	
			
		File f = new File("C:\\Users\\BASKAR\\eclipse-workspace\\Baskar\\Maven_Project\\User Details.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet createSheet = wb.createSheet("User Information");
		
		Row createRow = createSheet.createRow(0);
		
		Cell createceCell = createRow.createCell(0);
		
		createceCell.setCellValue("Baskaran V");
		
		wb.getSheet("User Information").getRow(0).createCell(1).setCellValue("101");
		
		wb.getSheet("User Information").createRow(1).createCell(0).setCellValue("Sasi Priya H");
		
		wb.getSheet("User Information").getRow(1).createCell(1).setCellValue("102");
		
		wb.getSheet("User Information").createRow(2).createCell(0).setCellValue("Mehandika B");
		
		wb.getSheet("User Information").getRow(2).createCell(1).setCellValue("103");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		wb.close();
		
		
	}

public static void main(String[] args) throws Throwable {

	write_data();
	
	
}


}
