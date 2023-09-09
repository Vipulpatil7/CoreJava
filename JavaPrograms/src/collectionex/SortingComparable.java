package collectionex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import java.lang.Comparable;

class Employeee implements Comparable<Employeee>{
	private String name;
	private double salary;
	
	public Employeee (String name, double salary) {
		this.name=name;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public int compareTo(Employeee o) {
		return this.name.compareTo(o.name);
	}	
}

public class SortingComparable {

	public static void main(String[] args) {
		
		List<Employeee> employees = new ArrayList<Employeee>(Arrays.asList(
				new Employeee("kapil",2000),
				new Employeee("amit",4000),
				new Employeee("Dilip",15000),
				new Employeee("Bipin",1000)
				));
		Collections.sort(employees);
		for(Employeee e:employees) {
			System.out.println(e.getName()+" => "+e.getSalary());
//		List<Employeee> emp = new ArrayList<Employeee>();
//		emp.add(new Employeee("honey",3000));
//		emp.add(new Employeee("angel",4000));
//		emp.add(new Employeee("teju",1800));
//		emp.add(new Employeee("rocky",1400));
//		emp.add(new Employeee("liyansh",3000));
//				Collections.sort(emp);
//				for(Employeee s:emp) {
//					System.out.println(s);
//				}
		}
	}
}


