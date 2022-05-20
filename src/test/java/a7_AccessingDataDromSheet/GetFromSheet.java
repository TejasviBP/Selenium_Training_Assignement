package a7_AccessingDataDromSheet;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetFromSheet {
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public GetFromSheet(String excelPath, String sheetName) throws IOException{

		//add references for your file =  workbook
		workbook= new XSSFWorkbook( excelPath);
		sheet= workbook.getSheet(sheetName);
	}
	
	
	public static void main(String[] args) throws IOException {
		getRowCount();// this method will get row count
		getCellData(0,0);
		getCellDataNumber(1,1);
	}

	
	public static void getRowCount() throws IOException {
		int rowCount =sheet.getPhysicalNumberOfRows();
		
		int colCount=sheet.getRow(1).getLastCellNum(); //count of columns
		System.out.println("row count:" +rowCount);
		System.out.println("col count:" +colCount);
	}
	
	public static void getCellData(int rowNum,int colNum) throws IOException {
	    //call function to get cell data
		String cellData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
	    System.out.println(cellData);
	}
	
	
	public static void getCellDataNumber(int rowNum,int colNum) throws IOException {
	
		double cellData= sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
	    System.out.println(cellData);
	}
	
}
