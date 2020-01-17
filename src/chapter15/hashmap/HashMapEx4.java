package chapter15.hashmap;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx4 {
	public static void main(String[] args) throws Exception {
		File f = new File("ooo.txt");
		Map<String, Integer> map = new HashMap<>();
		Scanner s = new Scanner(f);

		while (s.hasNext()) {
			String al = s.next() + "";
			al = al.toLowerCase();
			if (al.contains("hakuna")) {
				if (map.containsKey("hakuna")) {
					int newvalue = map.get("hakuna") + 1;
					map.put("hakuna", newvalue);
				} else {
					map.put("hakuna", 1);
				}

			} else if (al.contains("matata")) {
				if (map.containsKey("matata")) {
					int newvalue = map.get("matata") + 1;
					map.put("matata", newvalue);
				} else {
					map.put("matata", 1);
				}
			}

		}
//		System.out.println("파일 있음");
		System.out.println(map);

//			System.out.println(s.next());

		s.close();
	}

}
