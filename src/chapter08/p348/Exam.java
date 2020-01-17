package chapter08.p348;

import java.util.Scanner;


public class Exam {
	public static void main(String[] args) {
		//변수선언
		Rem rc=null;
		Scanner s = new Scanner(System.in);
		int vs = s.nextInt();
		
		Rem r1 = new St();
		r1.to();
		r1.tof();
		r1.sv(99);
		
		Sa s1 = new St();
		s1.s("abc");
		
		rc = new Tel();
		rc.to();
		rc.tof();
		rc.sv(vs);
		rc.sm(true);
		
		rc = new Au();
		rc.to();
		rc.tof();
		rc.sv(vs);
		rc.sm(true);
		
		Rem.cb();
	}
}
