package oops;
class Student{
	int id;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	String name;
	int age;
	String city;
	
	void display() {
		System.out.println("Id: "+id+" Name: "+name+" Age:"+age+" City: "+city);
	}
}
public class MethodChaining {

	public static void main(String[] args) {
		Student s=new Student();
		s.setId(1);

	}

}
