package collectionex;

import java.util.HashSet;

public class HashSetMethods {

	public static void main(String[] args) {
		
		HashSet<Integer> even = new HashSet<Integer>();
		even.add(2);
		even.add(4);
		System.out.println("HashSet1: "+even);
		
		HashSet<Integer> numbers= new HashSet<Integer>();
		numbers.add(1);
		numbers.add(3);
		System.out.println("HashSet2: "+numbers);
		
//		union of two sets
		numbers.addAll(even);
		System.out.println("Union is: "+numbers);
		numbers.retainAll(even);
		System.out.println("Intersection is: "+numbers);
		numbers.removeAll(even);
		System.out.println("Difference is: "+numbers);
		
		
	}

}
