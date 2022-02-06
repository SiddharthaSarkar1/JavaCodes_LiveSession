package mySecondPkg;

import java.util.*;

public class MyList {

	public static void main(String[] args) {
		ArrayList<Integer> arl = new ArrayList<>();
		System.out.println("Size of ArrayList : "+arl.size());
		arl.add(100);
		arl.add(45);
		arl.add(98);
		arl.add(34);
		arl.add(108);
		arl.add(6);
		System.out.println("Size of ArrayList : "+arl.size());
		System.out.println("ArrayList is : "+arl);
		for(int val : arl) {
			System.out.println(val);
		}
	}

}
