package collectionex;

import java.util.HashSet;

class Department{
	int did;
	String dname;
	public Department(int did,String dname) {
		this .did=did;
		this .dname=dname;
	}
}

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Department> hs = new HashSet<>();
		Department d1 = new Department(10,"HR");
		
		hs.add(d1);
		System.out.println("Departments:");
		for(Department d:hs) {
			System.out.println("Id: "+d.did);
			System.out.println("Name: "+d.dname);
		}
	}

}
