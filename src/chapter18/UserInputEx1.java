package chapter18;

import java.io.FileWriter;
import java.util.Scanner;

public class UserInputEx1 {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		FileWriter fw = new FileWriter("user.txt");
		
		String user = null;
		boolean run = true;
		while(run) {
			System.out.print("입력>");
			user=s.next();
			if (user.equals("exit")) {
				run=false;
			} else {
				fw.write(user);
				fw.write("\n");
			}
		}
		
		s.close();
		fw.close();
	}
}



