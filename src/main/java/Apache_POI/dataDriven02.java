package Apache_POI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven02 {
	
	
	
	
	public static void dd1() throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("This is the Folder name: :"+System.getProperty("user.dir"));
		
		
//		You can use it by ./ that is root folder
		File grr= new File(System.getProperty("user.dir")+"\\src\\main\\java\\Apache_POI\\TestNames.xlsx");
//		File grr= new File(".\\src\\main\\java\\Apache_POI\\TestNames.xlsx");
		
		

		FileInputStream fis = new FileInputStream(grr);
		XSSFWorkbook WorkBook = new XSSFWorkbook(fis);
		

		int gg = WorkBook.getNumberOfSheets();

		for (int i = 0; i < gg; i++) {

			System.out.println(WorkBook.getSheetName(i));

		}
		;

	};

}
