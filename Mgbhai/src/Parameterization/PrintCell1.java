package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintCell1 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream ("C:\\Parameterization selenium\\Mgbhai.xlsx");
		
		Sheet m = WorkbookFactory.create(file).getSheet("sheet1");
		
		int lastrowindex = m.getLastRowNum();
		
		for(int i=0;i<=lastrowindex;i++) {
			
			String data = m.getRow(i).getCell(0).getStringCellValue();
			
			
			System.out.println(data);
		
		
		
		}
		
		
		
	}	
		
		
	}

	