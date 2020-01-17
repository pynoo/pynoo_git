package chapter07.p290;

public class Dmb extends Cell {
	//필드
	int ch; //channel
	
	//생성자
	Dmb(String m, String c, int ch){
		this.m=m;
		this.c=c;
		this.ch=ch;
	}
	
	//메소드
	void tod() { //turnOnDmb
		System.out.println("채널 "+ch+"번 DMB방송 수신을 시작합니다.");
	}
	void ccd(int ch) { //changechannelDMB
		this.ch=ch;
		System.out.println("채널 "+ch+"번으로 바꿉니다.");
	}
	void tofd() { //turnoffDMB
		System.out.println("방송 수신을 멈춥니다.");
	}
}
