package chapter04.exercise;

public class Ch04Ex2 {
	public static void main(String[] args) {
//		int x=(int)(Math.random()*6)+1;
//		int y=(int)(Math.random()*6)+1;
//		int z=0;
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(x+y);
	while(true) {
		int x=(int)(Math.random()*6)+1;
		int y=(int)(Math.random()*6)+1;
		int z=0;
			System.out.println("("+x+","+y+")");
			z=x+y;
			if(z==5) {
		break;
			}
		}
		
	}
}
