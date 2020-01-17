package chapter18.p1022;

import java.io.FileInputStream;

public class FIleInputStreamEx {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\USER\\Desktop\\별찍기.txt");

			int i;
			while ((i = fis.read()) != -1) {
				System.out.write(i);
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
