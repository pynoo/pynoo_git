package chapter18;

import java.io.InputStreamReader;
import java.io.Reader;


public class InputStreamReaderEx1 {
	public static void main(String[] args) throws Exception {
		Reader isr = new InputStreamReader(System.in);
		
		System.out.print("입력>");
		int i =0;
		while((i=isr.read())!= -1) {
		System.out.println((char) i);	
		}
//		char c = (char) i;
		
//		System.out.println(c);
		
		isr.close();
	}
}
