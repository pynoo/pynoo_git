package chapter05;

public class StringEx1 {
	public static void main(String[] args) {
		
		String x = "유재석 재석 재석               ";
		System.out.println(x);
		
		System.out.println(x.length());
		System.out.println(x.charAt(3));
		System.out.println(x.indexOf("재석"));
		System.out.println(x.replace("재석", "1"));
		System.out.println(x.trim());
		
		System.out.println(x.substring(0, 1));
		
		String strVar2 = "유린기";
		String strVar3 = x + strVar2;
		System.out.println(strVar3);
		
		String strVar4 = strVar2 + 99;
		System.out.println(strVar4);
		
//		String strVar5 = "3" - "4"; // 안됨.
	}
}
