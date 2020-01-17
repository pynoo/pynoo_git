package chapter18.p1024;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamEx {
	public static void main(String[] args) throws Exception {
		String ofn = "C:\\Users\\USER\\Desktop\\음악넣기.png";
		String tfn = "C:\\Users\\USER\\Desktop\\temp\\음악넣기.png";
		
		FileInputStream fis = new FileInputStream(ofn);
		FileOutputStream fos = new FileOutputStream(tfn);
		
		int i;
		byte[] x = new byte[100];
		while((i=fis.read(x))!=-1) {
			fos.write(x, 0, i);
		}
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("copy finish");
	}
}
