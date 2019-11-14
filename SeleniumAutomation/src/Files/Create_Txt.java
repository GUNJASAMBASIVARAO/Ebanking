package Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class Create_Txt {
@Test
public void f() throws Exception {
	
	File f=new File(".\\TestReport\\Test.txt");
	FileWriter fw=new FileWriter(f);
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write("this is notepad");
	bw.newLine();
	bw.write("samba");
	bw.newLine();
	bw.write("siva");
	bw.close();
}
	
	
	
	
  
}
