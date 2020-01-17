package chapter10.section1050;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowEx1 {
	//main method를 던지면 바로 프로그램 종료됨
	public static void main(String[] args) {
		
		try {
			m1();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void m1() throws ClassNotFoundException , FileNotFoundException{
			Class c = Class.forName("java.lang.String");
			FileInputStream fis = new FileInputStream("");
	}
}
