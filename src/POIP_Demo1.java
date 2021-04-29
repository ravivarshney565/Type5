import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POIP_Demo1 {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File("src//ExcelXLSX.xlsx");
		
		FileInputStream fis1 = new FileInputStream(f1);
		
		XSSFWorkbook w1 = new XSSFWorkbook(fis1);
		
		XSSFSheet x1 = w1.getSheetAt(0);
		
		XSSFRow xr1 = x1.getRow(1);
		
		XSSFCell xc = xr1.getCell(2);
		
		String xcv = xc.getStringCellValue();
		
		System.out.println(xcv);

	}

}
