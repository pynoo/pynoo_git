package chapter15.hashmap;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class HashMapEx3 {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("lionking.txt");
		Map<String, Integer> map = new HashMap<>();
		int ch;
		
		while ((ch=fr.read()) != -1) {
			char c = (char) ch;
			String al = c+"";
			al = al.toLowerCase();
			
			if(map.containsKey(al)) {
				int newvalue = map.get(al)+1;
				map.put(al, newvalue);
			} else {
				map.put(al, 1);
			}
//			System.out.println(al);
		}
//		System.out.println("파일 있음");
		System.out.println(map);
		fr.close();
		
	}
}
