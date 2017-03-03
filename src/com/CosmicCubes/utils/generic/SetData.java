package com.CosmicCubes.utils.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SetData {
	
	public static void toExcel(String fileName, String sName, int rIndex, int cIndex, String data) {
		
		try {    
		
			File f = new File("./Test_data/"+fileName+".xlsx");
		    FileInputStream fis;
		
			fis = new FileInputStream(f);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet st = wb.getSheet(sName);
			Row r = st.getRow(rIndex);
			Cell c = r.getCell(cIndex);
		    c.setCellValue(data);
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
		}
		
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
