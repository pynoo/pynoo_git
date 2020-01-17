package chapter15.exercise.n07;

import java.util.List;

public class Exam {
	public static void main(String[] args) {
		Bd d = new Bd();
		List<Bo> l = d.getBol();
		for (Bo b : l) {
			System.out.println(b.getT()+"-"+b.getC());
		}
	}
}
