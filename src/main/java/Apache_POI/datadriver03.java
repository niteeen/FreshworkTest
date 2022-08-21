package Apache_POI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datadriver03 {

	@DataProvider(name = "takedata")
	public Object[][] datadriver() throws IOException {

		File grr = new File(System.getProperty("user.dir") + "\\src\\main\\java\\Apache_POI\\TestNames.xlsx");
//		File grr= new File(".\\src\\main\\java\\Apache_POI\\TestNames.xlsx");

		FileInputStream fis = new FileInputStream(grr);
		XSSFWorkbook WorkBook = new XSSFWorkbook(fis);

		int gg = WorkBook.getNumberOfSheets();
		XSSFSheet Sheet = WorkBook.getSheet("Names");
		int rowCount = Sheet.getLastRowNum();
		XSSFRow rnum = Sheet.getRow(0);
		rnum.getLastCellNum();

//		System.out.println(rowCount);

//		System.out.println(Sheet.getRow(1).getCell(1).getStringCellValue());

		int i = 0;
		int j = 0;

		Object[][] bb = new Object[3][2];
		Iterator<Row> rows = Sheet.rowIterator();

		while (rows.hasNext()) {

			Iterator<Cell> columns = rows.next().cellIterator();
			j = 0;
			while (columns.hasNext()) {

//				System.out.println(columns.next());
				bb[i][j] = columns.next();
				j++;

			}
			;

			i++;

		}
		;

		return bb;

	};

	@Test(dataProvider = "takedata")
	public static void ruunit(String one, String Two) {

		System.out.println(one + " " + Two);

	};

}
