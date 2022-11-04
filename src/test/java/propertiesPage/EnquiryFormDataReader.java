package propertiesPage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class EnquiryFormDataReader {
	HSSFWorkbook wb;
	HSSFSheet sheet;
	
	public EnquiryFormDataReader() throws IOException {
		File file = new File("C:\\Users\\shanjosh\\eclipse-workspace\\APSprint2\\datasource\\DataSource.xls");
		FileInputStream fis = new FileInputStream(file);
		wb = new HSSFWorkbook(fis);
		sheet = wb.getSheetAt(0);
	}
	
	public HSSFSheet getEnquiryFormSheet() {
		return sheet;
	}
	
	public int rowCount() {
		return sheet.getLastRowNum()-sheet.getFirstRowNum()+1;
	}
	
	public int colCount() {
		return sheet.getRow(0).getLastCellNum();
	}
}