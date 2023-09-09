package collectionex;

import java.util.LinkedList;
import java.util.Stack;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(10);
		ll.addFirst(23);
		ll.add(6);
		ll.addLast(40);
		ll.add(8);
		System.out.println("Elements in Linked List: "+ll);
		ll.removeLast();
		System.out.println("Elements in Linked List: "+ll);
		Stack<Integer> s = new Stack<Integer>();
		s.push(10);
		s.push(12);
		s.push(15);
		System.out.println("My elements are: "+s);
		s.pop();
		System.out.println("My elements: "+s);
	}

}
