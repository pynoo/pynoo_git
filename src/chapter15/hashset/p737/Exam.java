package chapter15.hashset.p737;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exam {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수 : " +size);
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String e = it.next();
			System.out.println("\t" + e);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수 : " +set.size());
		
		it=set.iterator();
		while(it.hasNext()) {
			String e = it.next();
			System.out.println("\t" + e);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("Empty");
		}
	}
}
