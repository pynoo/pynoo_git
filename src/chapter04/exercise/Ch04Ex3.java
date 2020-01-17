package chapter04.exercise;

public class Ch04Ex3 {
public static void main(String[] args) {
	for(int x=1;x<=10;x++) {
		for(int y=1;y<=10;y++) {
			int z=0;
			z=4*x+5*y;
			if(z==60) {
				System.out.println("("+x+","+y+")");
			}
		}
	}
}
}
