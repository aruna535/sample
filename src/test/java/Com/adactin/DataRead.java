package Com.adactin;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataRead {
	//31-07-24

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Maven23\\src\\test\\java\\Com\\adactin\\data 1.xlsx");

		FileInputStream fi = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fi);
		Sheet sheetAt = wb.getSheetAt(0);
		int rowsize = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < rowsize; i++) {
			Row row = sheetAt.getRow(i);
			int cellsize = row.getPhysicalNumberOfCells();
			for (int j = 0; j < cellsize; j++) {
				Cell cell = row.getCell(j);
				CellType typeOfCell = cell.getCellType();
				if (typeOfCell.equals(CellType.STRING)) {
					String vall = cell.getStringCellValue();
					System.out.println(vall);
				} else if (typeOfCell.equals(CellType.NUMERIC)) {
					double val2 = cell.getNumericCellValue();
					int val3 = (int) val2;
					System.out.println(val3);
				}

			}
		}
		
		// 01-08-24

		File file = new File(
				"C:\\Users\\ADMIN\\eclipse-workspace\\Maven23\\src\\test\\java\\Com\\adactin\\data 1.xlsx");
		FileInputStream fileInput = new FileInputStream(file);
		Workbook wb1 = new XSSFWorkbook(fileInput);
		wb1.createSheet("Aruna").createRow(0).createCell(0).setCellValue("Username");
		wb1.getSheet("Aruna").getRow(0).createCell(1).setCellValue("Paasword");
		FileOutputStream fo = new FileOutputStream(file);
		wb1.write(fo);
		System.out.println("Successfully written");
	}

}
