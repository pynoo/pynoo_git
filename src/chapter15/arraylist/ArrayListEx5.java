package chapter15.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx5 {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		List<St> l = new ArrayList<>();
		boolean loop = true;
		
		while (loop) {
			System.out.println("-----------------------------------------------");
			System.out.println("1. 입력 | 2. 삭제 | 3. 목록 | 4. 통계 | 5. 종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택>");
			int c = s.nextInt();
			
			switch(c) {
			case 1:
				addSt(l);
				break;
			case 2:
				removeSt(l);
				break;
			case 3:
				listSt(l);
				break;
			case 4:
				stSt(l);
				break;
			case 5:
				loop = false;
				System.out.println("종료");
				break;
			default:
				break;
			
			
			}
		}
	}
	
	private static void stSt(List<St> l) {
		St max = new St();
		max.setM(0);
		St min = new St();
		min.setM(100);
		double avg = 0;
		
		for (St st : l) {
			max = (max.getM()<st.getM()) ? st : max;
			min = (min.getM()>st.getM()) ? st : min;
			avg = avg+st.getM();
		}
		avg = avg/l.size();
//		for (St st : l) {
//			max = (max.getM()<st.getM()) ? st : max;
//		}
//		for (St st : l) {
//			min = (min.getM()>st.getM()) ? st : min;
//		}
//		for (St st : l) {
//			avg = avg+st.getM();
//		}
//		avg = avg/l.size();
		System.out.println("최고 점수 : "+max);
		System.out.println("최저 점수 : "+min);
		System.out.println("평균 점수 : "+avg);
		
	}

	private static void removeSt(List<St> l) {
		System.out.print("삭제할 index>");
		int index = s.nextInt();
		l.remove(index);
		
	}

	private static void listSt(List<St> l) {
		System.out.println("---------학생목록-----------");
		for (int i = 0; i < l.size(); i++) {
			System.out.println(i+":"+l.get(i));
		}
		
	}

	private static void addSt(List<St> l) {
		St st = new St();
		System.out.print("이름>");
		String n = s.next();
		System.out.print("점수>");
		int m = s.nextInt();
		st.setN(n);
		st.setM(m);
		l.add(st);
	}
}
