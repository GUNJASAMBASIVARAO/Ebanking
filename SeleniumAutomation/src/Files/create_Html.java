package Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class create_Html {
  @Test
  public void f() throws Exception {
	  File f=new File("D:\\Testing\\Workspace\\SeleniumAutomation\\TestResults\\Sample1.html");
	  FileWriter fw=new FileWriter(f);
	  BufferedWriter bw=new BufferedWriter(fw);
	  
	  bw.write("<html>");
	  bw.write("<body>");
	  bw.write("<table cellspacing='2' cellpading='2' boarder='2'>");
	  bw.write("<tbody>");
	  bw.write("<tr>");
	  bw.write("<td>");
	  bw.write("<font size='4' color='blue'>");
	    bw.write("SAMBA");
	  bw.write("</font>");
	  bw.write("</td>");
	  bw.write("</tr>");
	  
	  bw.write("<tr>");
	  bw.write("<td>");
	  bw.write("<font size='4' color='red'>");
	    bw.write("SIVA");
	  bw.write("</font>");
	  bw.write("</td>");
	  bw.write("</tr>");
	  
	  bw.write("<tr>");
	  bw.write("<td>");
	  bw.write("<font size='4' color='green'>");
	    bw.write("RAO");
	  bw.write("</font>");
	  bw.write("</td>");
	  bw.write("</tr>");
	  
	  
	  bw.write("</tbody>");
	  bw.write("</table>");
	  bw.write("</body>");
	  bw.write("</html>");
	  bw.close();
	  
	  
  }
}
