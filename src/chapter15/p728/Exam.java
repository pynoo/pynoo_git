package chapter15.p728;

import java.util.ArrayList;
import java.util.List;

public class Exam {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		
		l.add("java");
		l.add("JDBC");
		l.add("Servlet/JSP");
		l.add(2, "Database");
		l.add("iBATIS");
		
		int s = l.size();
		System.out.println("총 객체수 : "+s);
		System.out.println();
		String sk = l.get(2);
		System.out.println("2 : "+sk);
		System.out.println();
		
		for (int i = 0; i < l.size(); i++) {
			String str = l.get(i);
			System.out.println(i + ":"+ str);
		}
		System.out.println();
		
		l.remove(2);
		l.remove(2);
		l.remove("iBATIS");
		
		for (int i = 0; i < l.size(); i++) {
			String str = l.get(i);
			System.out.println(i + ":"+ str);
		}
	}
}
