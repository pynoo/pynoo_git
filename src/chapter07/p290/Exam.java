package chapter07.p290;

public class Exam {
	public static void main(String[] args) {
		//dmb 객체생성
		Dmb x = new Dmb("java", "black", 10);
		
		//cell로부터 상속받은 필드
		System.out.println("모델 : " + x.m);
		System.out.println("색상 : " + x.c);
		
		//dmb의 필드
		System.out.println("채널 : " + x.ch);
		
		//cell로부터 상속받은 메소드 호출
		x.pon();
		x.b();
		x.sv("여보세요.");
		x.rv("안녕하세요! 저는 홍길동인데요");
		x.sv("아~ 예 반갑습니다");
		x.hu();
		
		//dmb의 메소드 호출
		x.tod();
		x.ccd(12);
		x.tofd();
	}
}
