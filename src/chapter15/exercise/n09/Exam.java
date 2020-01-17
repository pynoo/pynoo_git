package chapter15.exercise.n09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Exam {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String n = null;
		int ms = 0;
		int ts = 0;
		
		Set<String> ks = map.keySet();
		Iterator<String> it = ks.iterator();
		
	
		String k;
		Integer v = null;
		while (it.hasNext()) {
			k = it.next();
			v = map.get(k);
			
			if( ms < v) {
				ms = v;
				n=k;
			}
			
			ts += v;
		
		}
		ts = ts/map.size();
		System.out.println("최고점수 : " + ms);
		System.out.println("평균점수 : " + ts);
		System.out.println("최고점수를 받은 아이디 : "+n);
		
		//value값을 받아 key값 리턴 불가능
	}
}
