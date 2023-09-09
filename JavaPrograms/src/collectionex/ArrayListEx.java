package collectionex;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(14);
		al.add(25);
		al.add(1, 23);
		al.add(7);
		System.out.println("My ArrayList: "+al);
		al.remove(3);
		System.out.println("My ArrayList: "+al);
		System.out.println("First Index: "+al.get(1));
		al.set(2, 8);
		System.out.println("My ArrayList: "+al.size());
		System.out.println("My ArrayList: "+al);
		ArrayList<Float> af= new ArrayList<Float>();
		af.add(2.5f);
		System.out.println(af);
		Collections.sort(al);
		System.out.println("Sorting data: ");
		for(Integer in:al) {
			System.out.println(in);
		}
		al.clear();
		
		ArrayList<String> as=new ArrayList<String>();
		as.add("Vipul");
		as.add("Harsh");
		as.add("Anurag");
		System.out.println(as);
		Collections.sort(as);
		System.out.println("Sorting data: ");
		for(String str: as) {
			System.out.println(str);
		}
	}

}
