package chapter15.array;

public class ArrayEx1 {
	public static void main(String[] args) {
		St[] st = new St[3];
		
		St s1 = new St();
		s1.setN("안나");
		s1.setM(80);
		
		St s2 = new St();
		s2.setN("엘사");
		s2.setM(85);
		
		St s3 = new St();
		s3.setN("올랄프");
		s3.setM(75);
		
		st[0] = s1;
		st[1] = s2;
		st[2] = s3;
		
		St s4 = new St();
		s4.setN("스벤");
		s4.setM(60);
		
		St[] st2 = new St[6];
		
		for (int i = 0; i < st.length; i++) {
			st2[i] = st[i];
		}
		st2[3] = s4;
		
		for (int i = 0; i < 4 ; i++) {
			System.out.println(st2[i].getN());
		}
		
		System.out.println("--------------------------");
		
		for (int i = 3; i < st2.length; i++) {
			st2[i-1] = st2[i];
		}
		
		for (int i = 0; i < 3 ; i++) {
			System.out.println(st2[i].getN());
		}
		
		
		
	}
}
