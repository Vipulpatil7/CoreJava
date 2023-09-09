package collectionex;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;


public class HashSetEx {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Vipul");
		hs.add("Anurag");
		hs.add("Pratik");
		hs.add("Harsh");
		hs.add("Viraj");
		hs.add("Devansh");
		System.out.println("Hash set:"+hs);
		System.out.println("*****Using Enhanced for loop********");
		for(String i:hs) {
			System.out.println(i);
		}
		System.out.println("*****Using Iterator************");
		Iterator<String> i = hs.iterator();
        while(i.hasNext()) 
            System.out.println(i.next());

	}
		
		

	}


