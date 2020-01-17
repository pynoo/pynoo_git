package chapter15.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import chapter15.arraylist.St;

public class ArrayListQuiz1 {
	public static List<St> listStudents() {
		List<St> list = new ArrayList<>();

		St s1 = new St();
		s1.setN("안나");
		s1.setM(80);

		St s2 = new St();
		s2.setN("엘사");
		s2.setM(85);

		St s3 = new St();
		s3.setN("올라프");
		s3.setM(75);

		St s4 = new St();
		s4.setN("스벤");
		s4.setM(60);

		St s5 = new St();
		s5.setN("크리스토퍼");
		s5.setM(73);

		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		return list;
	}

	public static void main(String[] args) {
		List<St> sList = listStudents();

		Scanner scanner = new Scanner(System.in);

		System.out.println("두 명의 학생의 이름과 점수를 입력하세요.");

		for (int i = 0; i < 2; i++) {
			St s = new St();
			System.out.print("이름>");
			String n = scanner.next();
			System.out.print("점수>");
			int m = scanner.nextInt();
			sList.add(s);
			s.setN(n);
			s.setM(m);
		}
		scanner.close();

		System.out.println("=====학생 목록=====");
		for (St s : sList) {
			System.out.println(s);
		}

		System.out.println("=====점수 통계=====");
		double avg = 0;
		St max = new St();
		max.setM(Integer.MIN_VALUE);
		St min = new St();
		min.setM(Integer.MAX_VALUE);
		for (int i = 0; i < sList.size() - 1; i++) {
			St st = sList.get(i);
			if (st.getM() > max.getM()) {
				max=st;
			}
		}
		System.out.println("최고 점수 : " + max);

		for (int i = 0; i < sList.size() - 1; i++) {
			St st = sList.get(i);
			if (st.getM() < min.getM()) {
				min = st;
			} 
		}
		System.out.println("최저 점수 : " + min);
		for (St s : sList) {
			avg += s.getM();
		}
		
		avg = avg / sList.size();
		System.out.println("평균 : " + avg);

	}
	// 최고 점수를 얻은 학생이름과 점수
	// 최저 점수를 얻은 학생이름과 점수
	// 평균 점수를 출력

}
