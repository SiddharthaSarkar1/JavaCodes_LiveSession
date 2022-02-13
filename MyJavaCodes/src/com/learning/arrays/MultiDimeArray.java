package com.learning.arrays;

import java.util.Scanner;

public class MultiDimeArray {

	public static void main(String[] args) {
		int marr[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of array : ");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				marr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		System.out.println("Printing the elements of array : ");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(marr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
