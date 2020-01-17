package chapter15.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class HashSetEx3 {
	public static void main(String[] args) {
		List<Set<Integer>> my = new ArrayList<>();
		my.add(new HashSet<Integer>());
		my.add(new HashSet<Integer>());
		my.add(new HashSet<Integer>());
		my.add(new HashSet<Integer>());
		my.add(new HashSet<Integer>());

		Set<Integer> com = new HashSet<>();
		Random r = new Random();
		long count = 0;
		for (int i = 0; i < my.size(); i++) {
			my.get(i);
			while(my.get(i).size() < 6 ) {

				my.get(i).add(r.nextInt(45) + 1);
			}
		}
		for (Set<Integer> g : my) {
			System.out.println("내꺼 : " + g);
		}
		System.out.println("-------------------------------------------");
		
	
		boolean loop =true;
		while (loop) {
			count++;

			while (com.size() < 6) {
				com.add(r.nextInt(45) + 1);
			}
//			System.out.println("방송 : " + com);
//
//			System.out.println("--------------------------");

			for (int i = 0; i < my.size(); i++) {
				boolean won = true;
				for (Integer c : com) {
//			System.out.println(c);
//			System.out.println(my.contains(c));

					if (!my.get(i).contains(c)) {
						won = false;
						break;
					}
				}
				if (won) {
					System.out.println("방송 : " + com);
					System.out.println("1st");
					System.out.println(count + "회에 당첨");
					System.out.println((count / 52) + "년 후 당첨");
					loop =false;
					break;
				}
//			} else {
////				System.out.println("next chance");
//				com.clear();

			}
			com.clear();
		}
	}
}
