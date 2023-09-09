package accessspecifier;

public class Private {
	
	private int age;
	private String name;
	
	public Private(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public static void main(String[] args) {
		
		Private pvt = new Private("Vipul",21);
		
		System.out.println("Name: "+pvt.getName());
		System.out.println("Age: "+pvt.getAge());
		
		pvt.setName("Vipul Patil");
		pvt.setAge(21);
		
		System.out.println("Updated Name: "+pvt.getName());
		System.out.println("Updated Age: "+pvt.getAge());
	}

}
