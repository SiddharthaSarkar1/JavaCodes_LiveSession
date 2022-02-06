package mySecondPkg;
import java.util.*;
public class MyHashMapCode {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(1, "Apple");
		hm.put(2, "Orange");
		hm.put(3, "Banana");
		hm.put(4, "Pineapple");
		hm.put(5, "Lime");
		hm.put(6, "Coconut");
		hm.put(7, "Grapes");
		hm.put(8, "Lichi");
		
		System.out.println(hm);
		System.out.println("Size of the HashMap is : "+hm.size());
		
		String myHm = hm.get(3);
		System.out.println("Value at key 3 is : "+myHm);
		System.out.println("Romoved ====>"+hm.remove(6));
		System.out.println("Contains key 4 ====>"+hm.containsKey(4)); 
		System.out.println("Contains key 6 ====>"+hm.containsKey(6)); 
		
		//Iterating HashMap
		for(Map.Entry<Integer, String> hmap : hm.entrySet()) {
			System.out.println("Key = "+hmap.getKey()+", Value = "+hmap.getValue()+".");
		}
		
		

	}

}
