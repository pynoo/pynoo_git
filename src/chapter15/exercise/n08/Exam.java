package chapter15.exercise.n08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Exam {
	public static void main(String[] args) {
		Set<St> s = new HashSet<>();
		
		s.add(new St(1,"홍길동"));
		s.add(new St(2,"개이득"));
		s.add(new St(1,"호이짜"));
		s.add(new St(4,"홍길동"));
		s.add(new St(1,"홍길동"));
		
		Iterator<St> it = s.iterator();
		while (it.hasNext()) {
			St st = it.next();
			System.out.println(st.nu + ":" + st.n);
		}
	}
}
