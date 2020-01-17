package chapter15.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapEx1 {
	public static void main(String[] args) {
		List<Integer> l =new ArrayList<>();
		
		l.add(3);
		l.add(4);
		
		Map<Integer, Integer> map = new HashMap<>();
		//키의 타입과 밸류 두가지 모두를 정의해주어야 함
		map.put(0, 1);
		map.put(2, 3);
		map.put(3, 4);
		map.put(0, 3);
		System.out.println(map.size());
		
		System.out.println(map.get(0));
		System.out.println(map.get(2));
		System.out.println(map.get(3));
		System.out.println(map.get(1));
		
		System.out.println();
		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			System.out.println(key+ " : "+ map.get(key));
		}
		System.out.println();
		
		Set<Map.Entry<Integer, Integer>> set = map.entrySet();
		Iterator<Map.Entry<Integer, Integer>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<Integer, Integer> entry =  it.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
			
		}
	}
}
