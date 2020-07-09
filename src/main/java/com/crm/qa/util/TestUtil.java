package com.crm.qa.util;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestUtil {
	
	
	static XSSFWorkbook workBook;
	static XSSFSheet sheet;
	static Object[][] data;
	
	
	public static Object[][] getExcelData(String sheetName){
	
		File f=new File("C:\\Users\\saitejamamidi\\eclipse-workspace\\CRM_POM_ENDTOEND_27Jun2020\\src\\main\\java\\com\\crm\\qa\\testdata\\ContactsUpload.xlsx");
		FileInputStream fip;            
		try {
		fip=new FileInputStream(f);
		 workBook =new XSSFWorkbook(fip);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	  
	    sheet=workBook.getSheetAt(0);
	    
			data =new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			for(int i=0;i<sheet.getLastRowNum();i++) {
				for(int j=0;j<sheet.getRow(0).getLastCellNum();j++) {
					
					data[i][j]=sheet.getRow(i+1).getCell(j).toString();
					
				}
				
			}
		
		return data;
		
	}

}
