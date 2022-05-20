package a7_AccessingDataDromSheet;

import java.io.IOException;

public class UseCellData {

	public static void main(String[] args) throws IOException {
		String projectPath= System.getProperty("user.dir");
		GetFromSheet excel= new GetFromSheet(projectPath+"/excel\\Book11.xlsx", "Sheet1");
		
		excel.getRowCount();
		excel.getCellData(0, 0);
		excel.getCellDataNumber(3, 1);
	}

}
