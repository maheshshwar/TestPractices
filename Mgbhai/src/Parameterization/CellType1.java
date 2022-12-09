package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CellType1 {
	
public static void main(String[] args ) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream ("C:\\Parameterization selenium\\Mgbhai.xlsx"); 
		
		CellType CT = WorkbookFactory.create(file).getSheet("sheet1").getRow(9).getCell(9).getCellType();
		
		
		System.out.println(CT);
		
		
		
}

}
