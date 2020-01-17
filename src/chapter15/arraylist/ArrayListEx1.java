package chapter15.arraylist;

import java.util.ArrayList;
import chapter15.array.St;

public class ArrayListEx1 {
	public static void main(String[] args) {
		
	//밑에 <St>타입 파라미터 또는 제네릭이라 표현
	ArrayList<St> st = new ArrayList<St>();
									//여기 St는 생략 가능
	
	St s1 = new St();
	s1.setN("안나");
	s1.setM(80);
	
	St s2 = new St();
	s2.setN("엘사");
	s2.setM(85);
	
	St s3 = new St();
	s3.setN("올랄프");
	s3.setM(75);
	
	st.add(s1);
	st.add(s2);
	st.add(s3);
	
	System.out.println(st.get(0).getN());
	
	St s4 = new St();
	s4.setN("스벤");
	s4.setM(60);
	
	st.add(s4);
	for (int i = 0; i < st.size(); i++) {
		System.out.println(st.get(i).getN());
	}
	
	st.remove(2);
	System.out.println("--------------------------");
	
	for (int i = 0; i < st.size(); i++) {
		System.out.println(st.get(i).getN());
	}
	
	}

}