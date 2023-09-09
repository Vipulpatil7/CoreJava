package oops;

abstract class Parent{
	static void display() {
		System.out.println("* Static metod inside abstract *");
	}
	static int x = 100;
}

public class StaticInsideAbstract extends Parent {

	public static void main(String[] args) {
		Parent obj = new StaticInsideAbstract();
		obj.display();
		System.out.println(Parent.x);
	}

}
