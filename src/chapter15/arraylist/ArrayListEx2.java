package chapter15.arraylist;

import java.util.ArrayList;

public class ArrayListEx2 {
	public static void main(String[] args) {
//	ArrayList<int> n = new ArrayList<int>();
		// int는 쓸 수가 없음 why???
		// ArrayList는 참조타입을 받기때문에

		ArrayList<Integer> n = new ArrayList<Integer>();

		n.add(15);
		n.add(99);
		n.add(101);
		n.add(123);

		for (Integer i : n) {
			System.out.println(i);
		}
		
		System.out.println();
		
		n.add(1, 31);

		for (Integer i : n) {
			System.out.println(i);
		}
		
		System.out.println();
		//자동 언박싱
		int n1 = n.get(2);
		System.out.println(n1);
		System.out.println();
		n.remove(2);
		for (Integer i : n) {
			System.out.println(i);
		}
	}
}
