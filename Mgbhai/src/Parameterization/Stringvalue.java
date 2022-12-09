package Parameterization;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Stringvalue {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream ("C:\\Parameterization selenium\\Mgbhai.xlsx");
		
		
		String data = WorkbookFactory.create(file).getSheet("sheet1").getRow(1).getCell(3).getStringCellValue();
		
		System.out.println(data); 
		
	}
	
	

}
