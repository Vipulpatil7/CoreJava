package oops;

abstract class AbstractEx1{
	abstract void display();
	void msg() {
		System.out.println("Hello");
	}
}

class AbstractChild extends AbstractEx1{
	@Override
	void display() {
		System.out.println("Abstract child");
	}
}

class AbstractChild1 extends AbstractEx1{
	@Override
	void display() {
		System.out.println("Abstract child 1");
	}
}

public class AbstractEx {

	public static void main(String[] args) {
		AbstractChild1 ac1=new AbstractChild1();
		ac1.display();
		ac1.msg();
		AbstractEx1 aeref;
		aeref=ac1;
		aeref.display();
		AbstractChild ac= new AbstractChild();
		ac.display();
		
	}

}
