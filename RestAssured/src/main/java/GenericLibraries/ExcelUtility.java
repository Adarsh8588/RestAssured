package GenericLibraries;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	// Workbook wb;
	/**
	 * To Open excelSheet
	 * 
	 * @param excelPath
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	/*
	 * public void openExcelUtility(String excelPath) throws Throwable {
	 * 
	 * FileInputStream fis = new FileInputStream(excelPath); Workbook wb =
	 * WorkbookFactory.create(fis); }
	 */

	/**
	 * To fetch Data from excel
	 * 
	 * @param sheetName
	 * @param rowNum
	 * @param cellNumber
	 * @return
	 * @return
	 * @throws Throwable
	 */

 
	public String getDataFromExcel(String sn, int rowNum, int cellNumber) throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/Book3.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet(sn);
		Row row = sh.getRow(rowNum);
		Cell cel = row.getCell(cellNumber);
		String data = cel.getStringCellValue();
		return data;
	}

	public int getRowCount(String sn) throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/Book3.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheet(sn);
		int count = sheet.getLastRowNum();
		return count;
	}

	/**
	 * To close the workbook
	 * 
	 * @throws IOException
	 */

	public void closeExcelWorkBook() throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/Book3.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.close();
	}

}