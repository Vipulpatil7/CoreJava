package oops;

interface Parent1{
	void displayParent1();
}
interface Parent2{
	void displayParent2();
}
interface Child extends Parent1,Parent2{
	void displayChild();
}
class Child1 implements Child{
	
	@Override
	public void displayParent2() {
		System.out.println("Parent 2");
	}
	@Override
	public void displayParent1() {
		System.out.println("Parent 1");
	}
	@Override
	public void displayChild() {
		// TODO Auto-generated method stub
		
	}
	
}

public class MultipleInheritance {

	public static void main(String[] args) {
		
		Child1 c = new Child1();
		c.displayParent1();
		c.displayParent2();
		c.displayChild();

	}

}
