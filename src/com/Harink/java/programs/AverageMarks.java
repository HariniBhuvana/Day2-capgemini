package com.Harink.java.programs;

public class AverageMarks {
	
	public static int[][] findAverageAndTotal(int array[][]) {
		int arrays[]=new int[10];
	for(int i=0;i<3;i++) {
		
		int total =0;
		int subtotal = 0;
		for(int j=0;j<3;j++) {
			
			// System.out.print(array[i][j]+ " ");
			 total = total + array[i][j];
			 subtotal = subtotal + array[j][i];
			 
		}
		System.out.println("Total of subject" + (i+1) +" " + total +" "+ "Avg of subject " + (float)total/3);
		System.out.println(" Total of student " + subtotal + " " + "Avg of student  " + (float)subtotal/3);
	}
	return array;

}
}
