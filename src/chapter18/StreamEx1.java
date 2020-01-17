package chapter18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class StreamEx1 {
	public static void main(String[] args) throws Exception {
		//byte 단위
		InputStream fis = new FileInputStream("ooo.txt");
		OutputStream fos = new FileOutputStream("aaaa.txt");
		
		//문자 단위
		Reader fr = new FileReader("ooo.txt");
		Writer fw = new FileWriter("bbb.txt");
		
		fis.close();
		fos.close();
		
		fr.close();
		fw.close();
		
		
	}
}
