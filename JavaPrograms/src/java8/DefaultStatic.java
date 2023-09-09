package java8;

interface MyInter1{
	void msg();
	void msg2();
	default void display() {
		System.out.println("Default method of interface");
	}
	static void displayStatic() {
		System.out.println("Static display method");
	}
}

public class DefaultStatic implements MyInter1{

	public static void main(String[] args) {
		DefaultStatic d = new DefaultStatic();
		d.msg();
		d.msg2();
		d.display();
		MyInter1.displayStatic();
	}
	@Override
	public void msg() {
		System.out.println("My Abstract method");
	}
	
	@Override
	public void msg2() {
		System.out.println("My abstract method 2");
	}

}
