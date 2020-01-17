package chapter05.exercise;

public class Exercise08 {
	public static void main(String[] args) {
		int[][] array= {
				{95 , 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum=0;
		double avg = 0.0;
		int i=0;
		int j = 0;
		int x=0;
		
		for( i=0;i<array.length;i++) {
			x += array[i].length;
			for ( j = 0; j < array[i].length; j++) {
				//System.out.print(array[i][j]);
				sum +=array[i][j];
				//avg = (double)(sum/(i+j));
			}
			//System.out.println("");
			//avg = (double)(sum/(i+j));
		}
		//avg = ((double)sum)/(i+j);
		avg =(double)sum/x;
		System.out.println("sum : "+sum);
		System.out.println("avg : " + avg);
		
	}
}
