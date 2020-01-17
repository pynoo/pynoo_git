package chapter07.polymophism;

public class AppEx1 {
	public static void main(String[] args) {
		KindCat t = new Tiger();
		//Tiger t = new Tiger();
		KindCat c = new HouseCat();
		//HouseCat c = new HouseCat();
		
		t.cry();
		c.cry();
		
		System.out.println(c instanceof Tiger);
		System.out.println(c instanceof HouseCat);
		System.out.println(c instanceof KindCat);
		
//		if (c instanceof Tiger) {
//			Tiger t2 = (Tiger) c;
//		}
		
		//Tiger t0 =t; ->KindCat의 범위가 더 커서 불가능
		Tiger t0 = (Tiger) t;
//		Tiger t2 = (Tiger) c; 
		t0.cry();
//		t2.cry();
		//-> 실행은 되지만 에러가 뜸
		//	(호랑이랑 고양이가 같지 않음)
	}
}
