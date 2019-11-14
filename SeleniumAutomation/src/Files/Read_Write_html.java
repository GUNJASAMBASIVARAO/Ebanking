package Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Read_Write_html {
  @Test
  public void f() throws Exception {
	  
	  FileInputStream fi=new FileInputStream(".\\TestData\\Sheet1.xlsx");
	  Workbook w=new XSSFWorkbook(fi);
	  Sheet s=w.getSheet("Sheet1");
	  
	  File f=new File(".\\TestResults\\Sample2.html");
	  FileWriter fw=new FileWriter(f);
	  BufferedWriter bw=new BufferedWriter(fw);
	  
	  bw.write("<html>");
	  bw.write("<body>");
	  bw.write("<table cellspacing='2' cellpading='2' boarder='2'>");
	  bw.write("<tbody>");
	  
	  for (int i = 0; i < s.getLastRowNum(); i++) {
		  Row r=s.getRow(i);
		  
		  Cell username = r.getCell(0);
		  Cell password = r.getCell(1);
		  System.out.println(username);
		  System.out.println(password);
		  
		  bw.write("<tr>");
		  bw.write("<td>");
		  bw.write("<font size='2' color='yellow'>");
		  bw.write(username.toString());
		  bw.write("</font>");
		  bw.write("</td>");
		  bw.write("</tr>");
		  
		
	}
	  bw.write("</tbody>");
	  bw.write("</table>");
	  bw.write("</body>");
	  bw.write("</html>");
	  bw.close();
	  
	  
	 
  }
}
