package com.learning.arrays;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements in array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of array : ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();	
		}
		sc.close();
		System.out.println("Printing the elements of array : ");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);	
		}
		int min, max;
		min = max = arr[0];
		
		//Finding minimum element
		for(int i=0;i<n;i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}

		//Finding the maximum element
		for(int i=0;i<n;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println("Maximum element : "+max);
		System.out.println("Minimum element : "+min);
	}

}
