package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintRowCell {      // row data print
	

public static void main(String[] args ) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream ("C:\\Parameterization selenium\\Mgbhai.xlsx");
		
		Sheet m = WorkbookFactory.create(file).getSheet("sheet1");
		
		short cellsize = m.getRow(0).getLastCellNum();
		
		System.out.println(cellsize);
		
		
	
		for(int i =0;i<cellsize;i++) {
			
			String data = m.getRow(0).getCell(i).getStringCellValue();
			
			System.out.print(data+"  ");  			
		}
		
		


		
	
}
}
