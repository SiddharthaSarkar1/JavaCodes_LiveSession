package com.learning.arrays;
import java.util.*;
public class MatrixAddition2d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int oneM[][] = new int[3][3];
		int twoM[][] = new int[3][3];
		int resultM[][] = new int[3][3];
		
		System.out.println("Enter the elements of first matrix : ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				oneM[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the second of first matrix : ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				twoM[i][j] = sc.nextInt();
			}
		}
		sc.close();
		//Adding two matrix
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				resultM[i][j] =oneM[i][j] + twoM[i][j];
			}
		}
		
		System.out.println("After adding first and second matrix the resultant matrix is : ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(resultM[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
