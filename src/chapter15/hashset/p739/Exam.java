package chapter15.hashset.p739;

import java.util.HashSet;
import java.util.Set;

public class Exam {
	public static void main(String[] args) {
		Set<Member> s = new HashSet<>();
		
		s.add(new Member("홍길동", 30));
		s.add(new Member("홍길동", 30));
		
		System.out.println("총 객체수 : "+s.size());
	}
}
