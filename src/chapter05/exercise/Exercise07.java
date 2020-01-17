package chapter05.exercise;

public class Exercise07 {
	public static void main(String[] args) {
		int max =0;
		
		int[] array = {1, 5, 3, 8,2};
		
		for(int i=0;i<array.length-1;i++) {
			if(array[i] > array[i+1]) {
				max = array[i];
			} else max= array[i+1];
//			if(max>array[3]) {
//				max = max;
//			} else max = array[3];
//			if(max>array[4]) {
//				max = max;
//			} else max = array[4];
		}
		System.out.println("max : " +max);
		
	}
}
