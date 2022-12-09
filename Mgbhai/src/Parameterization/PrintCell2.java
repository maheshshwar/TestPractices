package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintCell2 {
	
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream ("C:\\Parameterization selenium\\Mgbhai.xlsx");
		
		Sheet m = WorkbookFactory.create(file).getSheet("Sheet1");
		
		for( int i = 0;i<=m.getLastRowNum();i++)  {
			
			for(int j=0;j<=m.getRow(i).getLastCellNum()-1;j++) {
				
				String data = m.getRow(i).getCell(j).getStringCellValue();
			
				System.out.println(data+ " ");
				
				System.out.println(data);
				
				
			
			}
			
			
			}	

}
}
