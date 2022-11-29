package Com.Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	  XSSFWorkbook wrk;
	public ExcelDataProvider() throws IOException
	{
	
	String excelpath=System.getProperty("user.dir")+"\\TestData\\Data.xlsx";
	
    FileInputStream fil=new FileInputStream(excelpath);
     wrk=new XSSFWorkbook(fil);
     }
	
	public String getStringData(String sheetname,int row,int cell)
	{
		return wrk.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		
	}

}

