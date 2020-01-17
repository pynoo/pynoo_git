package chapter10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AutoCloseEx1 {
	public static void main(String[] args) {
		notAuto();
		auto();
	}
	public static void auto() {
		try (FileInputStream fis = new FileInputStream("numbers.txt");)	{
			char c = (char) fis.read();
			System.out.println(c);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void notAuto() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("numbers.txt");
			char c = (char) fis.read();
			System.out.println(c);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}