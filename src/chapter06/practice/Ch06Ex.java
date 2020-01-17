package chapter06.practice;

public class Ch06Ex {
	public static void main(String[] args) {
		Member x = new Member("홍길동", "hong");
		Member y = new Member("강자바", "java");
		
		System.out.println(x.name);
		System.out.println(x.id);
		System.out.println(x.pw);
		System.out.println(x.age);
		System.out.println("");
		
		System.out.println(y.name);
		System.out.println(y.id);
		System.out.println(y.pw);
		System.out.println(y.age);
		System.out.println("");
		
		MemberService z = new MemberService();
		boolean result = z.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			z.logout("hong");
		} else {
			System.out.println("id 또는 pw가 올바르지 않습니다.");
		}
		
		
	}
}
