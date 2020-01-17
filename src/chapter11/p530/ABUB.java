package chapter11.p530;

public class ABUB { //AutoBoxingUnBoxing
	public static void main(String[] args) {
		//AutoBoxing
		Integer o = 100;
		System.out.println("value : " + o.intValue());
		
		//대입십 자동 UnBoxing
		int v = o;
		System.out.println("value : " + v);
		
		//연산지 자동 UnBoxing
		int r = o+100;
		System.out.println("result : "+r);
	}
}
