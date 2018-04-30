package Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Excel implements Constant {
	
	public static String abc(String sheet,int row,int cell)
	{
		String s="";
		try {
			FileInputStream fis=new FileInputStream(PATH);
			Workbook wb = WorkbookFactory.create(fis);
			 s = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		} catch (Exception e) {
			
		}
		return s;
	}
	


}
