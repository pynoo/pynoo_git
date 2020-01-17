package chapter07.p290;

public class Cell {
	//필드
	String m; //model
	String c; //color
	
	//생성자
	
	//메소드
	void pon() { //poweron
		System.out.println("전원을 켭니다.");
	}
	void poff() { //poweroff
		System.out.println("전원을 끕니다.");
	}
	void b() { //bell
		System.out.println("벨이 울립니다.");
	}
	void sv(String m) { //sendVoice message
		System.out.println("자기 : " + m);
	}
	void rv(String m) { //receiveVoice message
		System.out.println("상대방 : " + m);
	}
	void hu() { //hangUp
		System.out.println("전화를 끊습니다.");
	}
}
