package chapter18;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterEx1 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("out3.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		
		osw.write("문자단위로 작성함");
		
		osw.close();
	}
}
