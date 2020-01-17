package chapter05;

import java.util.Scanner;

public class StringEx4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력>");
		String input = scanner.nextLine();
		
		System.out.println(input == "커피");
		System.out.println(input.equals("커피"));
	}
}