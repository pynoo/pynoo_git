package chapter15.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListEx3 {
	public static void main(String[] args) {
		List<Integer> b = new ArrayList<>(); //balls
		List<Integer> p = new ArrayList<>(); //picks
		
		Random r = new Random();
		
		for (int i = 1; i <=45 ; i++) {
			b.add(i);
		}
		
		p.add(b.remove(r.nextInt(45)));
		p.add(b.remove(r.nextInt(44)));
		p.add(b.remove(r.nextInt(43)));
		p.add(b.remove(r.nextInt(42)));
		p.add(b.remove(r.nextInt(41)));
		p.add(b.remove(r.nextInt(40)));
		
		for (Integer p1 : p) {
			System.out.println(p1);
		}
	}
}
