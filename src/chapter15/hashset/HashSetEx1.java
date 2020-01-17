package chapter15.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>(); // 인티저 타입만 받을 수 있음

		//순서가 상관이 없이
		//한번 출력이 되면 계속 그 숫자로 나옴
		//중복이 불가능!!!
		//index가 없어서 get()사용 불가
		set.add(99);
		set.add(33);
		set.add(189);
		set.add(542);
		set.add(52);
		set.add(62);
		set.add(82);
		set.add(21);
		set.add(24);
		

		System.out.println(set.size());

		for (Integer a : set) {
			System.out.println(a);
		}

		System.out.println();

		set.add(99);

		System.out.println(set.size());

		for (Integer a : set) {
			System.out.println(a);
		}
	}
}
