package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.Buffer;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Read_Txt_File {
 private static final String S = null;

/* @Test
  public void f() throws Exception {
	  File f=new File(".\\TestReport\\Test.txt");
	  FileReader fr=new FileReader(f);
	  BufferedReader br=new BufferedReader(fr);
	  String str=br.readLine();
	  System.out.println(str);
	  while((str=br.readLine()) !=null);{
		  if(str.equalsIgnoreCase("samba"));{
		  
	  }
	  
	  
  }
}*/

/*@Test
public void nestedfor() {
	
	for (int i = 0; i <= 5; i++) {
		
		for (int j = 0; j <= i; j++) {
			
			System.out.println(i);
			
			
		}
		System.out.println();
		
	}
}*/
	
	
	
@Test
public void Mrows_cell() throws Exception {
	
	FileInputStream fi=new FileInputStream(".\\TestData\\Sheet1.xlsx");
	  Workbook w= new XSSFWorkbook(fi);
	  Sheet s=w.getSheet("Sheet1");

	   for (int i = 0; i < s.getLastRowNum(); i++) {
		   Row r=s.getRow(i);
		   
		   for (int j = 0; j < r.getLastCellNum(); j++) {
			   Cell c=r.getCell(j);
			   System.out.println(c);
			
		}
		   
		
	}
}
  
  
  
  
  
  
  
  
  
  
  
}
