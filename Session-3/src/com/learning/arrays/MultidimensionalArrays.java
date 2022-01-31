package com.learning.arrays;

public class MultidimensionalArrays {

	public static void main(String[] args) {
		
		int mdarray[][] = {{1,2,3}, {3,6,1}, {7,5,4}};
		System.out.println("Accessing the first row 2nd element : "+mdarray[0][1]);
		System.out.println("Accessing the third row 1st element : "+mdarray[2][0]);
		System.out.println("Elements of the multidimensional array is : ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(mdarray[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
