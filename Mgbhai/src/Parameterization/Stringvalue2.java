package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Stringvalue2 {
			
		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			
			FileInputStream file = new FileInputStream ("C:\\Parameterization selenium\\Mgbhai.xlsx");
			
			
			boolean data = WorkbookFactory.create(file).getSheet("sheet1").getRow(2).getCell(2).getBooleanCellValue();
			
			System.out.println(data); 
			

			
			
		}	
			
		}

