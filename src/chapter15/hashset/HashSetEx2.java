package chapter15.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class HashSetEx2 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		Random r = new Random();
		
		while(set.size()<6) {
			set.add(r.nextInt(45)+1);
		}
		
		for (Integer n : set) {
			System.out.println(n);
		}
		
		Iterator<Integer> iter =set.iterator();
		while (iter.hasNext()) {
			Integer n = iter.next();
			System.out.println(n);
		}
	}
}
