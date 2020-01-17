package chapter18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class WriterEx1 {
	public static void main(String[] args) throws Exception{
		Writer fw = new FileWriter("output.txt");
		
		fw.write('국');
		fw.write("한사발 하실래예~?");
		fw.write(97);
		fw.write(new char[] {'한','\n', '글','\n','\n','\n','\n','\n', '임'});
		fw.write("요요요시~");
		
		fw.close();
		

		Reader fr = new FileReader("output.txt");
		int cnt=0;
		int i;
		while((i=fr.read()) != -1) {
			char c = (char) i;
			System.out.println(c);
			cnt ++;
		}
		System.out.println(cnt + "개의 문자");
		
		
		fr.close();
	}
}
