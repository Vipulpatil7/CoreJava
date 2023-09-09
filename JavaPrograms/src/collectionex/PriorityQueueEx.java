package collectionex;

import java.util.PriorityQueue;

class Employee implements Comparable<Employee>{
	int id;
	String name;
	String age;
	public Employee(int id,String name,String age) {
		super();
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}

public class PriorityQueueEx {

	public static void main(String[] args) {
		PriorityQueue<Employee> e=new PriorityQueue<Employee>();
		e.add(new Employee(4, "Vipul","23"));
		e.add(new Employee(1, "Anurag","21"));
		e.add(new Employee(3, "Pratik","23"));
		e.add(new Employee(5, "Harsh","20"));
		
		while(!e.isEmpty()) {
			System.out.println(e.remove());
		}
	}

}
