package chapter10.exercise.n07;

public class Exam {
	public static void main(String[] args) {
		try {
			login("white","12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue","54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws Exception {
		
		//id가 "blue"가 아니라면 NotExistIDException 발생시킴
		if(!id.equals("blue")) {
			throw new NEID("아이디가 존재하지 않습니다.");
		}
		
		//password가 "12345"가 아니라면 WrongPasswordException 발생시킴
		if(!password.equals("12345")) {
			//write
			throw new WPE("패스워드가 틀립니다.");
		}
	}
}
