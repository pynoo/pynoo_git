package chapter10.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class INF { //inputNumberFile
	public static void main(String[] args) {
		File f = new File("numbers.txt");
		Scanner s = null;
		long sum=0;
		int sc = 0; //strCount
		try {
			s= new Scanner(f);			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		}
		
		while (s.hasNext()) {
			String a = s.next();
			try {
				
			int num = Integer.parseInt(a);
			sum += num;
			}catch(NumberFormatException e) {
				sc++;
			}
		}
		
		System.out.println("총합 : " + sum);
		System.out.println("String : " + sc);
		
		s.close();
	}
}
