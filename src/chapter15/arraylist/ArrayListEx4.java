package chapter15.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<St> l = new ArrayList<>();
		
		for (int i = 0; i < 3 ; i++) {
			System.out.print("이름 : ");
			String n = s.next();
			System.out.print("점수 : ");
			int m = s.nextInt();
			
			St st = new St();
			l.add(st);
			st.setN(n);
			st.setM(m);
		}
		
		System.out.println("=====학생 목록=====");
		for (St st : l) {
			System.out.println(st);
		}
	}
}
