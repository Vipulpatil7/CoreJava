package stream;

public class Employee implements java.io.Serializable {
	
	public int id;
	public String name;

	public void Employee() {
		System.out.println("Name: "+name+"Address: "+id);
	}
}
