package chapter18.p1030;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderEx {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader r = new InputStreamReader(is);
		
		int i;
		char[] c = new char[100];
		while((i=r.read(c))!=-1) {
			String d = new String(c, 0, i);
			System.out.println(d);
		}
		r.close();
	}
}
