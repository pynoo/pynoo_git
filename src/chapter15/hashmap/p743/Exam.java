package chapter15.hashmap.p743;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Exam {
	public static void main(String[] args) {
		// 맵 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();

		// 객체저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 ENTRY 수 : " + map.size());

		// 객체찾기
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		System.out.println();

		// 객체를 하나씩 처리
		Set<String> ks = map.keySet();
		Iterator<String> it = ks.iterator();
		while (it.hasNext()) {
			String k = it.next();
			Integer v = map.get(k);
			System.out.println("\t" + k + " : " + v);
		}
		System.out.println();

		// 객체삭제
		map.remove("홍길동");
		System.out.println("총 ENTRY 수 : " + map.size());

		// 객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> es = map.entrySet();
		Iterator<Map.Entry<String, Integer>> eit = es.iterator();
		while (eit.hasNext()) {
			Map.Entry<String, Integer> e =eit.next();
			String k = e.getKey();
			Integer v = e.getValue();
			System.out.println("\t" + k + " : " + v);
		}
		System.out.println();
		
		//객체 전체 삭제
		map.clear();
		System.out.println("총 ENTRY 수 : " + map.size());

	}
}
