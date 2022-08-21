package Apache_POI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFName;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dt04 {

	@Test
	public void dpt() throws IOException {

		File grr = new File(System.getProperty("user.dir") + "\\src\\main\\java\\Apache_POI\\TestNames.xlsx");
//		File grr= new File(".\\src\\main\\java\\Apache_POI\\TestNames.xlsx");

		FileInputStream fis = new FileInputStream(grr);
		XSSFWorkbook WorkBook = new XSSFWorkbook(fis);

		int gg = WorkBook.getNumberOfSheets();
		XSSFSheet Sheet = WorkBook.getSheet("Names");
		int rowCount = Sheet.getLastRowNum();

//		System.out.println(rowCount);

//		System.out.println(Sheet.getRow(1).getCell(1).getStringCellValue());

		int i = 0;
		int j = 0;

		Iterator<Row> rows = Sheet.rowIterator();

		while (rows.hasNext()) {

			Iterator<Cell> columns = rows.next().cellIterator();
			j = 0;
			while (columns.hasNext()) {

				System.out.print(columns.next()+" ");
				

				System.out.println(i + "" + j);

				j++;

			}
			;
			System.out.println();

			i++;

		}
		;

	};

}
