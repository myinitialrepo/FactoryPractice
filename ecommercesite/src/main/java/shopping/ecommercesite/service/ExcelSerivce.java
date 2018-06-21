package shopping.ecommercesite.service;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSerivce {
	;
	XSSFWorkbook workbook = null;
	FileInputStream fs = null;
	XSSFSheet sheet = null;
	String[] values = null;

	public void buy (String fileName, String sheetName) throws IOException {
		fs = new FileInputStream(fileName);
		workbook = new XSSFWorkbook(fs);
		sheet = workbook.getSheet(sheetName);
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int j = 0; j < sheet.getRow(i).getLastCellNum(); j++) {
				XSSFRow row = sheet.getRow(i);
				System.out.print(row.getCell(j) + "\t");
			}
			// To separate rows
			System.out.println("");
		}
	}
}
