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
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		System.out.println("This is the Folder name: :"+System.getProperty("user.dir"));

//		You can use it by ./ that is root folder
		File grr = new File(System.getProperty("user.dir") + "\\src\\main\\java\\Apache_POI\\TestNames.xlsx");
//		File grr= new File(".\\src\\main\\java\\Apache_POI\\TestNames.xlsx");

		FileInputStream fis = new FileInputStream(grr);
		XSSFWorkbook WorkBook = new XSSFWorkbook(fis);

		int gg = WorkBook.getNumberOfSheets();

		for (int i = 0; i < gg; i++) {

			String sheetName = WorkBook.getSheetName(i);

			XSSFSheet tt = WorkBook.getSheetAt(i);

			// Entering into Sheet after fixing one index

			Iterator<Row> Rt = tt.rowIterator();
			Row Rows = Rt.next();
			Iterator<Cell> ct = 	Rows.cellIterator();

			System.out.println("Hey check this out:" + ct.next());

//			if sheetName.equalsIgnoreCase(""){}
//
//			System.out.println(WorkBook.getSheetName(i));

		}
		;

	}

}
