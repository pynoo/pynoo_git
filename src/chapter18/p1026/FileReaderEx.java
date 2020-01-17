package chapter18.p1026;

import java.io.FileReader;

public class FileReaderEx {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("C:\\Users\\USER\\Desktop\\이클립스\\myjava\\src\\project\\Main.java");

		int i;
		char[] c = new char[100];
		while ((i = fr.read(c)) != -1) {
			String d = new String(c, 0, i);
			System.out.print(d);
		}
		fr.close();
	}
}
