package com.zohocrm.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author shashank
 * This is generic class for data driven testing
 *
 */

public class FileLib {
	
	/**
	 * This generic method is used to read the data from property files 
	 * @param key
	 * @return String
	 * @throws IOException
	 */
	
	public String getPropertyData(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("./data/Project.property");
		Properties p = new Properties();
		p.load(fis);
		String data =p.getProperty(key);
		return data;
		
	}
	
	/**
	 * This generic method is used to read the data form microsoft excel
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return String
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExcelData(String sheetname, int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
		 Workbook wb =WorkbookFactory.create(fis);
		 String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		 return data;
	}
	
	/**
	 * This generic method is used to set/update value in Excel Sheet
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @param value
	 * @throws IOException
	 * @return void
	 */
	
	public void setExcelData(String sheetname, int row, int cell,String value) throws IOException
	{
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(value);
		
		FileOutputStream fos = new FileOutputStream("./data/testscript.xslx");
		wb.write(fos);
		wb.close();
	}
	
	
	
	

}
