package Apache_POI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven02 {

	public static void dd1() throws IOException {
		// TODO Auto-generated method stub

//		System.out.println("This is the Folder name: :" + System.getProperty("user.dir"));

//		You can use it by ./ that is root folder
		File grr = new File(System.getProperty("user.dir") + "\\src\\main\\java\\Apache_POI\\TestNames.xlsx");
//		File grr= new File(".\\src\\main\\java\\Apache_POI\\TestNames.xlsx");

		FileInputStream fis = new FileInputStream(grr);
		XSSFWorkbook WorkBook = new XSSFWorkbook(fis);

		int gg = WorkBook.getNumberOfSheets();
		XSSFSheet Sheet = WorkBook.getSheet("Names");
		int rowCount = Sheet.getLastRowNum();

		System.out.println(rowCount);

//		System.out.println(Sheet.getRow(1).getCell(1).getStringCellValue());
		int i = 0;
		int j = 0;

		Iterator<Row> rows = Sheet.rowIterator();

		while (rows.hasNext()) {
			j = 0;
			Iterator<Cell> columns = rows.next().cellIterator();
			while (columns.hasNext()) {

				System.out.print(columns.next() + " ");
				System.out.println(i + "" + j);
				j++;

			}
			;
			System.out.println("");
			i++;

		}
		;

	}
}
